class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        List<Integer> al = new ArrayList<Integer>();
        for(int x : nums1)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int y : nums2)
        {
            if(hm.containsKey(y))
            {
                al.add(y);
                hm.put(y,hm.get(y)-1);
                if(hm.get(y) == 0)
                    hm.remove(y);
            }
        }
        int[] ans = new int[al.size()];
        for(int i = 0; i < al.size(); i++)
        {
            ans[i] = al.get(i);
        }
        return ans;
    }
}