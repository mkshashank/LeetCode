class Solution {
    public int maxProduct(int[] nums) 
    {
        int max = Integer.MIN_VALUE, prefix = 1, suffix = 1, n = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            prefix = (prefix == 0) ? nums[i] : prefix * nums[i];
            suffix = (suffix == 0) ? nums[n-i-1] : suffix * nums[n-i-1];
            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}