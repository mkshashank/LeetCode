class Solution {
    public String toLowerCase(String s) {
        if(s == null) return null;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray())
        {
            if(c >= 65 && c <= 90)
                sb.append(String.valueOf((char)(c+32)));
            else
                sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
}