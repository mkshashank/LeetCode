class Solution {
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j)
        {
            while(arr[i] <= pivot && i <= high-1)
            {
                i++;
            }
            while(arr[j] > pivot && j >= low+1)
            {
                j--;
            }
            if(i < j)
                swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }

    public void qS(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int partIndex = partition(arr,low,high);
            qS(arr,low,partIndex-1);
            qS(arr,partIndex+1,high);
        }
    }

    public void quickSort(int[] arr)
    {
        int low = 0;
        int high = arr.length - 1;
        qS(arr,low,high);
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums);
        return nums;
    }
}