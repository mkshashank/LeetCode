class Solution 
{
    public int countPartitions(int[] nums) 
    {
        int count = 0, n = nums.length, leftSum = 0;
        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];

        for(int i = n-2; i > 0; i--)
            suffix[i] = suffix[i+1] + nums[i];
        
        for(int i = 0; i < n-1; i++)
        {
            leftSum += nums[i];
            int rightSum = suffix[i+1];
            if((leftSum-rightSum) % 2 == 0)
                count++;
        }

        return count;
        
    }
}