class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int max = n*n, count = 0, left = 0, top = 0, right = n-1, bottom = n-1;
        while(count < max)
        {
            for(int i = top, j = left; j <= right && count < max; j++)
                matrix[i][j] = ++count;
            top++;
            for(int i = top, j = right; i <= bottom && count < max; i++)
                matrix[i][j] = ++count;
            right--;
            for(int i = bottom, j = right; j >= left && count < max; j--)
                matrix[i][j] = ++count;
            bottom--;
            for(int i = bottom, j = left; i >= top && count < max; i--)
                matrix[i][j] = ++count;
            left++;
        }
        return matrix;
    }
}