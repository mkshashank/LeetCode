class Solution 
{
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int removeDuplicates(int[] nums) 
    {
        int k = 1, prev = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != prev)
            {
                
                prev = nums[i];

                if(i != k)
                    swap(nums,i,k);
                    
                k++;
            }

        }
        return k;
    }
}