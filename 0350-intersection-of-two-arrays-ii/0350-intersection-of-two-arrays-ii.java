class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int m = nums1.length, n = nums2.length;
        int[] visited = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(nums1[i] == nums2[j] && visited[j] == 0)
                {
                    visited[j] = 1;
                    list.add(nums1[i]);
                    break;
                }
            }
        } 
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);
        return ans;
    }
}