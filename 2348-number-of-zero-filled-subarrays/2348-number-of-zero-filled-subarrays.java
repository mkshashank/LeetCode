class Solution 
{
    public long zeroFilledSubarray(int[] nums) 
    {
        long streak = 0, count = 0;
        for(int x : nums)
        {
            if(x == 0)
                streak++;
            else
            {
                count += (streak * (streak+1) / 2);
                streak = 0;
            }
        }
        if(streak > 0)
        {
                count += (streak * (streak+1) / 2);
                streak = 0;
        } 
        return count;
    }
}