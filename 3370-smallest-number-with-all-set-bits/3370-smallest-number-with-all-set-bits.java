class Solution 
{
    public int smallestNumber(int n) 
    {
        for(int i = n; i <= Integer.MAX_VALUE; i++)
        {
            int num = i;
            boolean found = true;
            while(num > 0)
            {
                if(num % 2 == 0)
                {
                    found = false;
                    break;
                }
                num /= 2;
            }
            if(found)
                return i;
        }
        return -1;
    }
}