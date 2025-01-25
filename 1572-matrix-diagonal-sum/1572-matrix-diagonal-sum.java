class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == j)
                    sum += mat[i][j];
            }
            if(i != n-i-1)
                sum += mat[i][n-i-1];
        }
        return sum;
    }
}