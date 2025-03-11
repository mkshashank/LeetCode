class Solution 
{
    public int numberOfSubstrings(String s) 
    {
        int n = s.length(), count = 0, left = 0;
        int[] hashArr = new int[3];
        for(int right = 0; right < n; right++)
        {
            hashArr[s.charAt(right)-'a']++;
            while(hashArr[0] > 0 && hashArr[1] > 0 && hashArr[2] > 0) 
            {
                count += n-right;
                hashArr[s.charAt(left)-'a']--;
                left++;
            }
        }
        return count;
    }
}