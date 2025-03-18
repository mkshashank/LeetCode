class Solution {
    public int longestNiceSubarray(int[] nums) 
    {
        int maxi = 1, n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int bitmask = 0;
            int len = 0;
            for(int j = i; j < n; j++)
            {
                if((bitmask & nums[j]) == 0)
                {
                    bitmask |= nums[j];
                    len++;
                    maxi = Math.max(maxi,len);
                }
                else break;
            }
        } 
        return maxi;   
    }
}