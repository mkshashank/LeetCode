class Solution {
    public long countBadPairs(int[] nums) 
    {
        long n = nums.length;
        long totalPairs = (n*(n-1))/2;
        long goodPairs = 0;
        Map<Integer,Long> map = new HashMap<Integer,Long>();
        for(int i = 0; i < n; i++)
        {
            int diff = i - nums[i];
            goodPairs += map.getOrDefault(diff,0L);
            map.put(diff,map.getOrDefault(diff,0L)+1);
        }
        return totalPairs - goodPairs;
    }
}