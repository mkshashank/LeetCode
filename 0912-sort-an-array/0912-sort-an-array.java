class Solution 
{
    public void mergeSort(int[] arr, int low, int high)
    {
        if(low >= high) return;
        int mid = low + (high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public void merge(int[] arr, int low, int mid, int high)
    {
        int[] temp = new int[high-low+1];
        int ind = 0, i = low, j = mid+1;
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
                temp[ind++] = arr[i++];
            else
                temp[ind++] = arr[j++];
        }
        while(i <= mid) temp[ind++] = arr[i++];
        while(j <= high) temp[ind++] = arr[j++];
        
        for(i = low; i <= high; i++)
            arr[i] = temp[i-low];
    }

    public int[] sortArray(int[] nums) 
    {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}