class Solution {
    public static List<Integer> generateRow(int row)
    {
        List<Integer> ansRow = new ArrayList<Integer>();
        int res = 1;
        ansRow.add(res);
        for(int col = 1; col < row; col++)
        {
            res = res * (row-col);
            res = res / (col);
            ansRow.add(res);
        }
        return ansRow;
    }

    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 1; i <= numRows; i++)
		{
            ans.add(generateRow(i));
		}
        return ans;
    }
}