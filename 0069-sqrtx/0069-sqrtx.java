class Solution 
{
    public int mySqrt(int x) 
    {
        long low = 1, high = x;
        while(low <= high)
        {
            long mid = low+(high-low)/2;
            long prod = mid*mid;
            if(prod <= x)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return (int)high;
    }
}