class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> al1 = new ArrayList<Integer>();
        List<Integer> al2 = new ArrayList<Integer>();
        Set<Integer> hs1 = new HashSet<Integer>();
        Set<Integer> hs2 = new HashSet<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for(int x : nums1)
            hs1.add(x);

        for(int y : nums2)
            hs2.add(y);

        Set<Integer> clone1 = new HashSet<Integer>(hs1);
        hs1.removeAll(hs2);
        hs2.removeAll(clone1);

        for(int x : hs1)
            al1.add(x);

        for(int y : hs2)
            al2.add(y);

        ans.add(al1);
        ans.add(al2);

        return ans;
    }
}