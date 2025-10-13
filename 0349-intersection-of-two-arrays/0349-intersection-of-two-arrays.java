class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int i = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int x : nums1)
            set1.add(x);

        for(int x : nums2)
            if(set1.contains(x))
                set2.add(x);

        int[] ans = new int[set2.size()];

        for(int x : set2)
            ans[i++] = x;

        return ans;
    }
}