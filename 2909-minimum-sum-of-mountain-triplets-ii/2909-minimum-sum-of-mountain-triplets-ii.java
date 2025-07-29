class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length, minSum = Integer.MAX_VALUE;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i = 1; i < n; i++)
            prefix[i] = Math.min(prefix[i-1],nums[i]);
        for(int i = n-2; i >= 0; i--)
            suffix[i] = Math.min(suffix[i+1],nums[i]);
        for(int j = 1; j < n-1; j++)
            if(nums[j] > prefix[j-1] && nums[j] > suffix[j+1]) 
                minSum = Math.min(minSum,nums[j]+prefix[j-1]+suffix[j+1]);
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}