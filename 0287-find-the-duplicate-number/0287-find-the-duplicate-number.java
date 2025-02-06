class Solution {
    public int findDuplicate(int[] nums) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x) == 2)
                return x;
        }
        return 0;
    }
}