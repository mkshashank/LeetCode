class Solution {
    public String thousandSeparator(int n) {
        String s = "" + n;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--)
        {
            if(count == 3)
            {
                sb.append(".");
                i++;
                count = 0;
            }
            else
            {
                sb.append("" + s.charAt(i));
                count++;
            }
        }
        sb.reverse();
        return sb.toString();
    }
}