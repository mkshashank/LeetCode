class Solution 
{
    public boolean checkZero(int a, int b)
    {
        while(a > 0)
        {
            int lastDigit = a % 10;
            a /= 10;
            if(lastDigit == 0)
                return false;
        }
        while(b > 0)
        {
            int lastDigit = b % 10;
            b /= 10;
            if(lastDigit == 0)
                return false;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) 
    {
        int[] res = new int[2];
        for(int i = 1; i <= n; i++)
        {
            int a = i;
            int b = n-i;
            if(checkZero(a,b))
            {
                res[0] = a;
                res[1] = b;
                return res;
            }
        }    
        return res;
    }
}