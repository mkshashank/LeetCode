class Solution {
    public static void rev(int[] arr, int i, int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    public void nextPermutation(int[] nums) {
        int ind = -1;

        if(nums.length <= 1) return;

        for(int i = nums.length-2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                ind = i;
                break;
            }
        }

        if(ind == -1)
        {
            rev(nums,0,nums.length-1);
            return;
        }

        for(int i = nums.length-1; i >= ind; i--)
        {
            if(nums[i] > nums[ind])
            {
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }

        rev(nums,ind+1,nums.length-1);
    }
}