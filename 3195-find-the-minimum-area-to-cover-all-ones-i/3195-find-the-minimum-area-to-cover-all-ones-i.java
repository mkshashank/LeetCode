class Solution 
{
    public int minimumArea(int[][] grid) 
    {
        int minRow = Integer.MAX_VALUE, minCol = Integer.MAX_VALUE, 
        maxRow = Integer.MIN_VALUE, maxCol = Integer.MIN_VALUE;    

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    minRow = Math.min(minRow,i);
                    minCol = Math.min(minCol,j);
                    maxRow = Math.max(maxRow,i);
                    maxCol = Math.max(maxCol,j);
                }
            }
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }
}