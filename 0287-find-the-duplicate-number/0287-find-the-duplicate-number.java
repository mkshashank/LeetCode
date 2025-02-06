class Solution {
    public int findDuplicate(int[] nums) 
    {
        boolean[] arr = new boolean[nums.length];

        for(int x : nums)
        {
            if(arr[x])
                return x;
            else
                arr[x] = true;
        }

        return -1;
    }
}