class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat[0].length * mat.length) != (r * c)) return mat;
        int[][] ans = new int[r][c];
        int ansRow = 0, ansCol = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {
                ans[ansRow][ansCol] = mat[i][j];
                ansCol++;
                if(ansCol == c)
                {
                    ansCol = 0;
                    ansRow++;
                }
            }
        }
        return ans;
    }
}