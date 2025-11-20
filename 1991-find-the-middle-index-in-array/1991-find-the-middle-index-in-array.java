class Solution {
    public int findMiddleIndex(int[] nums) 
    {
        int totalSum = 0, prefixSum = 0, index = -1, n = nums.length;
        for(int x : nums)
            totalSum += x; 
        for(int i = 0; i < n; i++)
        {
            int leftSum = 0, rightSum = 0;
            prefixSum += nums[i];
            leftSum = prefixSum - nums[i];
            rightSum = totalSum - prefixSum;
            if(leftSum == rightSum)
            {
                index = i;
                break;
            }
        }
        return index;
    }
}