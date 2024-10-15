class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> hs = new HashSet<Integer>();
        int i = 0, j = 0;
        long sum = 0, max = 0;
        while(j < nums.length)
        {
            if(hs.contains(nums[j]))
            {
                sum -= nums[i];
                hs.remove(nums[i]);
                i++;
            }
            else
            {
                sum += nums[j];
                hs.add(nums[j]);
                if((j - i + 1) == k)
                {
                    max = Math.max(sum,max);
                    sum -= nums[i];
                    hs.remove(nums[i]);
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}