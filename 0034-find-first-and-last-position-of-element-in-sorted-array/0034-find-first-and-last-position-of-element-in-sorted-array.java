class Solution 
{
    public int lowerBound(int[] nums, int target)
    {
        int low = 0, high = nums.length-1, ans = nums.length;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(target <= nums[mid])
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
            if(target < nums[mid])
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
        int lowerBound = lowerBound(nums,target);
        if(lowerBound == nums.length || nums[lowerBound] != target) return new int[]{-1,-1};
        int upperBound = upperBound(nums,target);
        return new int[]{lowerBound,upperBound-1};
    }
}