class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] posArr = new int[nums.length/2];
        int[] negArr = new int[nums.length/2];
        int posIndex = 0, negIndex = 0;

        for(int x : nums)
        {
            if(x > 0)
                posArr[posIndex++] = x;
            else
                negArr[negIndex++] = x;
        }

        int count = 0;

        for(int i = 0; i < nums.length/2; i++)
        {
            nums[count++] = posArr[i];
            nums[count++] = negArr[i];
        }

        return nums;
    }
}