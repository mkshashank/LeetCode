class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> ans = new ArrayList<>();
        int top = 0, left = 0, m = matrix.length, n = matrix[0].length;
        int bottom = m-1, right = n-1;
        while(top <= bottom && left <= right)
        {
            //traverse left to right
            for(int i = left; i <= right; i++)
                ans.add(matrix[top][i]);
            top++;

            //traverse top to bottom
            for(int i = top; i <= bottom; i++)
                ans.add(matrix[i][right]);
            right--;
            
            //traverse right to left
            if(top <= bottom)
            {
                for(int i = right; i >= left; i--)
                    ans.add(matrix[bottom][i]);
                bottom--;
            }

            //traverse bottom to top
            if(left <= right)
            {
                for(int i = bottom; i >= top; i--)
                    ans.add(matrix[i][left]);
                left++;
            }
        }
        return ans;
    }
}