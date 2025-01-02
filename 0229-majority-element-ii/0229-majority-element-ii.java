class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int min = nums.length/3;
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x) > min && !ans.contains(x))
                ans.add(x);
        }

        return ans;
    }
}