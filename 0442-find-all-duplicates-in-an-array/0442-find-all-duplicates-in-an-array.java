class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
                ans.add(entry.getKey());
        }

        return ans;
    }
}