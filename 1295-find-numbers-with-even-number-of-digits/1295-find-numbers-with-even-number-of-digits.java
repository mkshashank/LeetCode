class Solution 
{
    public int findNumbers(int[] nums) 
    {
        int totalCount = 0;
        for(int x : nums)
        {
            int num = x;
            int count = 0;
            while(num > 0)
            {
                num /= 10;
                count++;
            }
            if((count & 1) != 1)
                totalCount++;
        }
        return totalCount;
    }
}