class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        int i = 0, j = 0;
        while(i < strs[0].length() && j < strs[strs.length-1].length())
        {
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(j))
            {
                sb.append(strs[0].charAt(i));
                i++;
                j++;
            }
            else break;
        }
        return sb.toString();
    }
}