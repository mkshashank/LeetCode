class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        while(i < str.length())
        {
            if(Character.isDigit(str.charAt(i)))
            {
                if(i > 0)
                {
                    str.deleteCharAt(i-1);
                    i--;
                }
                str.deleteCharAt(i);
            }
            else
                i++;
        }
        return str.toString();
    }
}