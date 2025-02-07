class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);
        while(!map.isEmpty())
        {
            ArrayList<Integer> temp = new ArrayList<>();
            Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
            while(iterator.hasNext())
            {
                Map.Entry<Integer,Integer> entry = iterator.next();
                int key = entry.getKey(), val = entry.getValue();
                if(!temp.contains(key))
                {
                    temp.add(key);
                    if(val - 1 == 0)
                        iterator.remove();
                    else
                        entry.setValue(val-1);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}