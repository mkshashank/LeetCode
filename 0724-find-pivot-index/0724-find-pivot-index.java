class Solution {
    public int pivotIndex(int[] nums) 
    {
        int n = nums.length, leftSum = 0, totalSum = 0;
        for(int x : nums)
            totalSum += x;
        for(int i = 0; i < n; i++)
        {
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }    
        return -1;
    }
}