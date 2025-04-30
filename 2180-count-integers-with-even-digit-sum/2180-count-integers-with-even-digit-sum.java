class Solution 
{
    public int countEven(int num)
    {
        int count = 0;
        for(int i = 2; i <= num; i++)
        {
            int digit = i;
            int sum = 0;
            while(digit > 0)
            {
                int cur = digit % 10;
                digit /= 10;
                sum += cur;
            }
            if((sum & 1) != 1)
                count++;
        }
        return count;
    }
}