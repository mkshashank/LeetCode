class Solution 
{
    public int[] getSneakyNumbers(int[] nums) 
    {
        int[] ans = new int[2];
        int[] hashArr = new int[nums.length];

        for(int x : nums)
            hashArr[x]++;

        int i = 0;
        for(int j = 0; j < hashArr.length; j++)
        {
            if(hashArr[j] == 2)
            {
                ans[i] = j;
                i++;
            }
            if(i == 2) break;
        }

        return ans;
    }
}