class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] < nums2[j])
                i++;
            else if(nums2[j] < nums1[i])
                j++;
            else if(list.size() == 0 || list.get(list.size()-1) != nums1[i])
            {
                list.add(nums1[i]);
                i++;j++;
            }
            else
            {
                i++;j++;
            }
        }
        i = 0;
        int[] ans = new int[list.size()];
        for(int x : list)
            ans[i++] = x;
        return ans;
    }
}