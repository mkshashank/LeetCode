class Solution {
    public int longestSubarray(int[] nums) 
    {
        int max = 0, curLen = 0, maxLen = 0;
        for(int x : nums)
            max = Math.max(x,max);
        for(int x : nums)
        {
            if(x == max)
            {
                curLen++;
                maxLen = Math.max(curLen,maxLen);
            }
            else
                curLen = 0;
        }  
        return maxLen;  
    }
}