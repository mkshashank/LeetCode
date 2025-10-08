class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        k = k % nums.length;
        int[] temp = new int[nums.length];
        int ind = 0;
        for(int i = nums.length-k; i < nums.length; i++)
        {
            temp[ind++] = nums[i];
        }

        for(int i = 0; i < nums.length-k; i++)
        {
            temp[ind++] = nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = temp[i];
        }
    }
}