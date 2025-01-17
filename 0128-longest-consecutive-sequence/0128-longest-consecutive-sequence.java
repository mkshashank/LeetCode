class Solution 
{
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int max = 1, lastSmaller = Integer.MIN_VALUE, count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]-1 == lastSmaller)
            {
                count += 1;
                lastSmaller = nums[i];
            }
            else if(lastSmaller != nums[i])
            {
                lastSmaller = nums[i];
                count = 1;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}