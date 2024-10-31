class Solution {
    public int dominantIndex(int[] nums) {
        int large = 0;
        int largeIndex = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > large)
            {
                large = nums[i];
                largeIndex = i;
            }
        }

        for(int j = 0; j < nums.length; j++)
        {
            if(large != nums[j] && large < (2 * nums[j]))
                return -1;
        }

        return largeIndex;
    }
}