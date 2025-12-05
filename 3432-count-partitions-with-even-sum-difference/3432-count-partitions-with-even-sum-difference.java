class Solution 
{
    public int countPartitions(int[] nums) 
    {
        int total = 0, count = 0, leftSum = 0, n = nums.length;
        for(int x : nums)
            total += x;
        
        for(int i = 0; i < n-1; i++)
        {
            leftSum += nums[i];
            int rightSum = total - leftSum;
            if(((leftSum - rightSum) & 1 )== 0)
                count++;
        }
        return count;
    }
}