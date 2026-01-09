class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int prev = Integer.MIN_VALUE, maxi = 1, count = 0;
        for(int x : nums)
        {
            if(x == prev+1)
            {
                prev = x;
                count++;
                maxi = Math.max(maxi,count);
            }
            else if(prev != x)
            {
                prev = x;
                count = 1;
            }
        }
        return maxi;
    }
}