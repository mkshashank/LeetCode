class Solution {
    public boolean divideArray(int[] nums) 
    {
        int[] hashArr = new int[501];
        for(int x : nums)
            hashArr[x]++;

        for(int x : hashArr)
            if((x & 1) == 1)
                return false;

        return true;    
    }
}