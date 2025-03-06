class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        Arrays.sort(nums);
        int maxi = 0, lastSmaller = Integer.MIN_VALUE, count = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]-1 == lastSmaller)
            {
                lastSmaller = nums[i];
                count++;
            }
            else if(nums[i] != lastSmaller)
            {
                lastSmaller = nums[i];
                count = 1;
            }
            maxi = Math.max(maxi,count);
        }
        return maxi;
    }
}