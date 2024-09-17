class Solution {
    public int compress(char[] chars) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        char ch = chars[0];
        for(int i = 0; i < chars.length; i++)
        {
            if(chars[i] == ch)
            {
                count++;
            }
            else
            {
                ans.append(ch);
                if(count > 1)
                {
                    ans.append(count);
                }
                count = 1;
                ch = chars[i];
            }
            if(i == chars.length-1)
            {
                ans.append(ch);
                if(count > 1)
                {
                    ans.append(count);
                }
            }
        }
        for(int i = 0; i < ans.length(); i++)
        {
            chars[i] = ans.charAt(i);
        }
        return ans.length();
    }
}