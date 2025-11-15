class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int[] ans = new int[nums.length];
        int i = 0, j = n;
        for(int k = 0; k < n; k++)
        {
            ans[i++] = nums[k];
            ans[i++] = nums[j++];
        }
        return ans;
    }
}