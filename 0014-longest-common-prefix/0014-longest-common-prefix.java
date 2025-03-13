class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        StringBuilder sb = new StringBuilder();
        outer:for(int i = 0; i < strs[0].length(); i++)
        {
            int curr = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++)
            {
                if(i >= strs[j].length() || strs[j].charAt(i) != curr)
                    break outer;
            }
            sb.append((char)curr);
        }
        return sb.toString();
    }
}