class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        for(int i = 0; i <= haystack.length()-needle.length(); i++)
        {
            if(needle.charAt(0) == haystack.charAt(i))
            {
                if(haystack.substring(i,i+needle.length()).equals(needle))
                    return i;
            }
        }
        return -1;
    }
}