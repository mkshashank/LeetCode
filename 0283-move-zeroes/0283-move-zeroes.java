class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int[] temp = new int[nums.length];
        int ind = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
                temp[ind++] = nums[i];
        }    

        for(int i = 0; i < nums.length; i++)
            nums[i] = temp[i];
    }
}