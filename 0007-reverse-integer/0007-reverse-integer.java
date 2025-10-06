class Solution {
    public int reverse(int x) 
    {
        long rev = 0;
        boolean isNeg = false;

        if(x < 0)
        {
            isNeg = true;
            x = -x;
        }

        while(x > 0)
        {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x /= 10; 
        }   

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;

        int ans = (int) rev; 

        return isNeg == true ? -ans : ans;
    }
}