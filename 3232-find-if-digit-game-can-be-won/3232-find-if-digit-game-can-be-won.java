class Solution {
    public boolean canAliceWin(int[] nums) 
    {
        int singleTotal = 0, doubleTotal = 0;
        for(int x : nums)
        {
            if(x < 10)
                singleTotal += x;
            else
                doubleTotal += x;
        }    
        return singleTotal != doubleTotal;
    }
}