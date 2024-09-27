class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> al = new ArrayList<Integer>();
        int i = 0, j = 0, count = 0;
        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j])
            {
                al.add(nums1[i]);
                i++;
            }
            else if(nums2[j] < nums1[i])
            {
                al.add(nums2[j]);
                j++;
            }
            else if(nums1[i] == nums2[j])
            {
                al.add(nums1[i]);
                i++;
            }
        }
        if(i < m && j == n)
        {
            while(i < m)
            {
                al.add(nums1[i]);
                i++;
            }
        }
        else if(j < n)
        {
            while(j < n && nums2[j] != 0)
            {
                al.add(nums2[j]);
                j++;
            }
        }
        
        for(int x : al)
        {
            nums1[count++] = x;
        }
    }
}