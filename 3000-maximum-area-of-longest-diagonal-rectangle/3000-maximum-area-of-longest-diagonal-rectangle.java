class Solution 
{
    public int areaOfMaxDiagonal(int[][] dimensions) 
    {
        double diagLen = 0;
        int maxArea = 0;
        for(int i = 0; i < dimensions.length; i++)
        {
            int a = dimensions[i][0], b = dimensions[i][1];
            double len = Math.sqrt((a*a)+(b*b));
            int area = a*b;
            if(len > diagLen || (len == diagLen && area > maxArea))
            {
                diagLen = len;
                maxArea = area;
            }
        }
        return maxArea;
    }
}