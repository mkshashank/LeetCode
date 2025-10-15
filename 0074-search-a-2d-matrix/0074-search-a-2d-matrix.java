class Solution 
{
    public boolean binarySearch(int[] arr, int low, int high, int target)
    {
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid] < target)
                low = mid+1;
            else high = mid-1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) 
    {
        for(int i = 0; i < matrix.length; i++)
        {
            if(binarySearch(matrix[i],0,matrix[i].length-1,target) == true)
                return true;
        }
        return false;
    }
}