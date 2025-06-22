class Solution 
{
    public String[] divideString(String s, int k, char fill) 
    {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()%k != 0)
            sb.append(fill);
        String[] ans = new String[sb.length()/k];
        for(int i = 0; i < sb.length()/k; i++)
            ans[i] = sb.substring(i*k,(i+1)*k);
        return ans;
    }
}