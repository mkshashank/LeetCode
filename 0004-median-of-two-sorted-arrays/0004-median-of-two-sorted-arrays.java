class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        List<Integer> list = new ArrayList<>();
        for(int x : nums1)
                list.add(x);
        for(int x : nums2)
                list.add(x);
        Collections.sort(list);
        if(list.size() == 0) return 0;
        if(list.size()%2 == 1)
            return list.get(list.size()/2);
        else
        {
            int mid = list.size()/2;
            double ans = (list.get(mid) + list.get(mid-1)) / 2.0;
            return ans;
        }
    }
}