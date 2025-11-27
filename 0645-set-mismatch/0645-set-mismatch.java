class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        int[] arr = new int[2];
        int sum = 0;
        int actualSum = (nums.length * (nums.length + 1)) / 2;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(hs.contains(nums[i]))
            {
                arr[0] = nums[i];
                continue;
            }
            hs.add(nums[i]);
            sum += nums[i];
        }
        arr[1] = actualSum - sum;
        return arr;
    }
}