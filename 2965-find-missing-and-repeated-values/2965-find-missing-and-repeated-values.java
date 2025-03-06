class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        Set<Integer> set = new HashSet<>();
        int n = grid.length, repeatingNumber = 0, actualSum = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(set.contains(grid[i][j]))
                    repeatingNumber = grid[i][j];
                else
                {
                    set.add(grid[i][j]);
                    actualSum += grid[i][j];
                }
            }
        }
        n = n*n;
        long totalSum = n * (n+1)/2;
        int missingNumber = (int)(totalSum - actualSum);
        return new int[]{repeatingNumber,missingNumber};
    }
}