class Solution 
{
    public int binarySearch(int[] nums, int target, int low, int high)
    {
        if(low > high) return -1;

        int mid = (low+high)/2;

        if(target == nums[mid])
            return mid;
        else if(target > nums[mid])
            return binarySearch(nums,target,mid+1,high);

        return binarySearch(nums,target,low,mid-1);
    }
    public int search(int[] nums, int target) 
    {
        return binarySearch(nums,target,0,nums.length-1);
    }
}