class Solution 
{
    public int countPartitions(int[] nums) 
    {
        int count = 0, leftSum = 0;
        for(int i = 0; i < nums.length-1; i++)
        {
            leftSum += nums[i];
            int rightSum = 0;
            for(int j = i+1; j < nums.length; j++)
            {
                rightSum += nums[j];
            }
            if((leftSum - rightSum) % 2 == 0)
                count++;
        }    
        return count;
    }
}