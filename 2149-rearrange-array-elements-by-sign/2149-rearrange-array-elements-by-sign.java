class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int n = nums.length, i = 0, j = 0;
        int[] posArr = new int[n/2];
        int[] negArr = new int[n/2];

        for(int x : nums)
        {
            if(x < 0)
                negArr[j++] = x;
            else
                posArr[i++] = x;
        }

        i = j = 0;

        for(int k = 0; k < n; k+=2)
        {
            nums[k] = posArr[i++];
            nums[k+1] = negArr[j++];
        }

        return nums;
    }
}