class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int n = nums.length;
        if(n <= 1) return n;
        int j = 0, count = 0;
        for(int i = 0; i < n; i++)
        {
            if(i == 0 || nums[i] == nums[i-1])
                count++;
            else
                count = 1;
            
            if(count <= 2)
                nums[j++] = nums[i];
        }
        return j;
    }
}