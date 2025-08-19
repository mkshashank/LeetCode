class Solution 
{
    public long zeroFilledSubarray(int[] nums) 
    {
        long count = 0, streak = 0;
        for(int x : nums)
        {
            if(x == 0)
            {
                streak++;
                count += streak;
            }
            else
                streak = 0;
        }
        return count;
    }
}