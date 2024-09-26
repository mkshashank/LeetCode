class Solution {
    public void markRows(int i, int[][] matrix)
    {
        for(int j = 0; j < matrix[0].length; j++)
        {
            if(matrix[i][j] != 0)
            {
                matrix[i][j] = -999;
            }
        }
    }

    public void markCols(int j, int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            if(matrix[i][j] != 0)
            {
                matrix[i][j] = -999;
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    markRows(i,matrix);
                    markCols(j,matrix);
                }
            }
        }
        
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == -999)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}