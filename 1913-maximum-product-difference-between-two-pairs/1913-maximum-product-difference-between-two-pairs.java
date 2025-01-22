class Solution {
    public int maxProductDifference(int[] nums) {
        if(nums.length <= 1) return 0;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE, max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for(int x : nums)
        {
            if(x > max)
            {
                secondMax = max;
                max = x;
            }
            else if(x > secondMax)
                secondMax = x;
            if(x < min)
            {
                secondMin = min;
                min = x;
            }
            else if(x < secondMin)
                secondMin = x;
        }
        return max*secondMax - min*secondMin;
    }
}