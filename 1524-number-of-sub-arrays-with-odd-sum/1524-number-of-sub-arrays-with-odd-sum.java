class Solution {
    public int numOfSubarrays(int[] arr) 
    {
        long ans = 0;
        int odd = 0, even = 0, sum = 0;
        for(int x : arr)
        {
            sum += x;

            if((sum & 1) == 1)
            {
                ans += even + 1;
                odd++;
            }
            else
            {
                ans += odd;
                even++;
            }
        }  
        return (int) (ans % 1000_000_007);
    }
}