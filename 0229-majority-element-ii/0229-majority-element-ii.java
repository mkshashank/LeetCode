class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > (nums.length/3))
                ans.add(entry.getKey());
            if(ans.size() == 2) break;
        }

        return ans;
    }
}