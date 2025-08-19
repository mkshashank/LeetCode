class Solution 
{
    public long zeroFilledSubarray(int[] nums) 
    {
        long count = 0, left = -1;
        int right = 0;
        while(right < nums.length)
        {
            if(nums[right] == 0)
            {
                if(left == -1)
                {
                    left = right;
                }
                count = count + right - left + 1;
            }
            else left = -1;
            right++;
        }
        return count;
    }
}