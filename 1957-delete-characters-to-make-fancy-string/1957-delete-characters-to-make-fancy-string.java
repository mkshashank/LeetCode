class Solution {
    public String makeFancyString(String s) {
        if(s == null || s.isBlank()) return s;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == s.charAt(i-1))
                count++;
            else
                count = 1;
            
            if(count <= 2)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}