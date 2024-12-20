class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) return new int[0][];
        int pos = 0;
        int[][] ans = new int[m][n];
        for(int i = 0; i < ans.length; i++)
        {
            for(int j = 0; j < ans[i].length; j++)
            {
                ans[i][j] = original[pos++];
            }
        }
        return ans;
    }
}