class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int[] visited = new int[nums2.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = 0; j < nums2.length; j++)
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
        {
            ans[i] = list.get(i);
        }

        return ans;
    }
}