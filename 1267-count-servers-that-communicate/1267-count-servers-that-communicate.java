class Solution {
    public boolean isSameRow(int[][] grid, int i)
    {
        int count = 0;
        for(int j = 0; j < grid[i].length; j++)
        {
            if(grid[i][j] == 1)
            {
                count++;
            }
        }
        return count > 1;
    }
    public boolean isSameCol(int[][] grid, int j)
    {
        int count = 0;
        for(int i = 0; i < grid.length; i++)
        {
            if(grid[i][j] == 1)
            {
                count++;
            }
        }
        return count > 1;
    }
    public int countServers(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    if(isSameRow(grid,i) || isSameCol(grid,j))
                        count++;
                }
            }
        }
        return count;
    }
}