class Solution {
    public List<Integer> spiralOrder(int[][] matrix)
    {
        int minRow = 0;
        int minCol = 0;
        int maxRow = matrix.length - 1;
        int maxCol = matrix[0].length - 1;
        int totalElements = matrix.length * matrix[0].length;
        int count = 0;
        List<Integer> al = new ArrayList<Integer>();
        
        while(count < totalElements)
        {
            //Top wall
            for(int i = minRow, j = minCol; j <= maxCol && count < totalElements; j++)
            {
                al.add(matrix[i][j]);
                count++;
            }
            minRow++;
            //Right wall
            for(int i = minRow, j = maxCol; i <= maxRow && count < totalElements; i++)
            {
                al.add(matrix[i][j]);
                count++;
            }
            maxCol--;
            //Bottom wall
            for(int i = maxRow, j = maxCol; j >= minCol && count < totalElements; j--)
            {
                al.add(matrix[i][j]);
                count++;
            }
            maxRow--;
            //Left wall
            for(int i = maxRow, j = minCol; i >= minRow && count < totalElements; i--)
            {
                al.add(matrix[i][j]);
                count++;
            }
            minCol++;
        }
        return al;
    }
}