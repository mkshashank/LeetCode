class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int sum = 0;
        int actualSum = (nums.length * (nums.length + 1)) / 2;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(i > 0 && nums[i] == nums[i-1])
            {
                arr[0] = nums[i];
                continue;
            }
            sum += nums[i];
        }
        arr[1] = actualSum - sum;
        return arr;
    }
}