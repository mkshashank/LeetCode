class Solution 
{
    public int reverse(int x) 
    {
        long ans = 0;
        while(x != 0)
        {
            int lastDigit = x % 10;
            x /= 10;
            ans = ans * 10 + lastDigit;
        }    

        return ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ? 0 : (int)ans;
    }
}