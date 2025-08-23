class Solution {
    public void merge(int[] arr, int low, int mid, int high)
    {
        int i = low;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[high-low+1];
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while(i <= mid)
            temp[k++] = arr[i++];
        while(j <= high)
            temp[k++] = arr[j++];
        for(int x = 0; x < temp.length; x++)
        {
            arr[low+x] = temp[x];
        }
    }

    public void mergeSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public void mS(int[] nums)
    {
        int low = 0;
        int high = nums.length-1;
        mergeSort(nums,low,high);
    }
    public int[] sortArray(int[] nums) {
        mS(nums);
        return nums;
    }
}