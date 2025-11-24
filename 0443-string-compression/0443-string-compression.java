class Solution {
    public int compress(char[] chars) 
    {
        if(chars.length == 1) return 1;
        if(chars.length == 0) return 0;
        int count = 1, n = chars.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n; i++)
        {
            if(chars[i] == chars[i-1])
                count++;
            else
            {
                sb.append(chars[i-1]);
                if(count > 1)
                    sb.append(count);
                count = 1;
            }
        }
        sb.append(chars[n-1]);
        if(count > 1)
            sb.append(count);
        for(int i = 0; i < sb.length(); i++)
        {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}