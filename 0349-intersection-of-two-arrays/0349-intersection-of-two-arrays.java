class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs1 = new HashSet<Integer>();
        Set<Integer> hs2 = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
            hs1.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++)
        {
            if(hs1.contains(nums2[j]))
            {
                hs2.add(nums2[j]);
            }
        }
        int[] ans = new int[hs2.size()];
        int k = 0;
        for(int x : hs2)
        {
            ans[k++] = x;
        }
        return ans;
    }
}