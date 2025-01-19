class Solution {
    public int gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int x : nums)
        {
            if(x > max)
                max = x;
            if(x < min)
                min = x;
        }
        return gcd(min,max);
    }
}