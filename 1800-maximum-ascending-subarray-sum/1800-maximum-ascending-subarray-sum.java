class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0], maxi = nums[0], n = nums.length;
        if(n == 0) return 0;
        for(int i = 1; i < n; i++)
        {
            if(nums[i] > nums[i-1])
                sum += nums[i];
            else
            {
                maxi = Math.max(maxi,sum);
                sum = nums[i];
            }
        }
        return Math.max(maxi,sum);
    }
}