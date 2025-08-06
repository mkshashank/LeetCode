class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n = nums.length, total = 0, currentSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            total ^= i+1;
            currentSum ^= nums[i];
        }
        return total ^ currentSum;
    }
}