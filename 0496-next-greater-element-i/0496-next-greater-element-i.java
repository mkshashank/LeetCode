class Solution 
{
    public int findGreater(int[] arr, int num)
    {
        int start = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == num)
            {
                start = i;
                break;
            }
        }
        
        if(start == -1) return -1;

        for(int i = start; i < arr.length; i++)
            if(arr[i] > num)
                return arr[i];
        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < ans.length; i++)
            ans[i] = findGreater(nums2,nums1[i]);
        return ans;
    }
}