class Solution 
{
    public int lowerBound(int[] nums, int target)
    {
        int low = 0, high = nums.length-1, ans = -1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] >= target)
            {
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return ans;
    }

    public int upperBound(int[] nums, int target)
    {
        int low = 0, high = nums.length-1, ans = nums.length;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] > target)
            {
                ans = mid;
                high = mid-1;   
            }
            else
                low = mid+1; 
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) 
    {
        int lb = lowerBound(nums,target);
        if(lb == -1 || nums[lb] != target)
            return new int[]{-1,-1};
        return new int[]{lb,upperBound(nums,target)-1};
    }
}