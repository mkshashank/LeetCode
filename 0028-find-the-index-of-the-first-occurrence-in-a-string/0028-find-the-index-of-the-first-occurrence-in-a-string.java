class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        if(needle == null || needle.isEmpty()) return -1;
        char c = needle.charAt(0);
        for(int i = 0; i <= haystack.length()-needle.length(); i++)
        {
            if(haystack.charAt(i) == c)
            {
                String s = haystack.substring(i,i+needle.length());
                if(s.equals(needle))
                    return i;
            }
        }    
        return -1;
    }
}