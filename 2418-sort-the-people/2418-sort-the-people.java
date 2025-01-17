class Solution {
    public void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    public int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high], i = low, j = high;
        while(i < j)
        {
            while(arr[i] > pivot && i < high)
                i++;

            while(arr[j] <= pivot && j > low)
                j--;

            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[high] = arr[i];
        arr[i] = pivot;
        return i;
    }
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        for(int i = 0; i < names.length; i++)
        {
            map.put(heights[i],names[i]);
        }

        quickSort(heights,0,heights.length-1);

        for(int i = 0; i < heights.length; i++)
        {
            names[i] = map.get(heights[i]);
        }

        return names;
    }
}