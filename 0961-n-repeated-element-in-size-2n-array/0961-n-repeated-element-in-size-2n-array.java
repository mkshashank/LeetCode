class Solution 
{
    public int repeatedNTimes(int[] nums) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);
        
        for(int x : nums)
            if(map.get(x) == (nums.length/2))
                return x;
        
        return -1;
    }
}