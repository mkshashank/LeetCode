class Solution 
{
    public boolean binarySearch(int[] arr, int target)
    {
        int low = 0, high = arr.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == target)
                return true;
            else if(target > arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) 
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                int start = 0, end = matrix[i].length-1;
                if(matrix[i][start] <= target &&  target <= matrix[i][end])
                    return binarySearch(matrix[i],target);
                else
                    break;
            }
        }
        return false;
    }
}