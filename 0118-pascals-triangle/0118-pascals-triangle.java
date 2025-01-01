class Solution {
    public static int nCr(int n, int r)
    {
        if(n <= 0 || r <= 0) throw new IllegalArgumentException("Only positive values allowed");
        if(n == 1 && r == 1) return 1;
        n = n-1;
        r = r-1;
        int res = 1;
        for(int i = 0; i < r; i++)
        {
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }

    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 1; i <= numRows; i++)
		{
            ArrayList<Integer> temp = new ArrayList<Integer>();
		    for(int j = 1; j <= i; j++)
		    {
		        temp.add(nCr(i,j));
		    }
		    ans.add(temp);
		}
        return ans;
    }
}