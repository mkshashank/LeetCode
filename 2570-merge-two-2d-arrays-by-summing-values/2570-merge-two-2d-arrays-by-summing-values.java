class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) 
    {
        Map<Integer,Integer> map = new TreeMap<>();
        int id = 0, val = 0, idIndex = 0;
        for(int i = 0; i < nums1.length; i++)
        {
            id = 0; val = 0;
            for(int j = 0; j < nums1[i].length; j++)
            {
                if(j == 0)
                    id = nums1[i][j];
                else
                    val = nums1[i][j];
            }
            map.put(id,val);
        }

        for(int i = 0; i < nums2.length; i++)
        {
            id = 0; val = 0;
            for(int j = 0; j < nums2[i].length; j++)
            {
                if(j == 0)
                    id = nums2[i][j];
                else
                    val = nums2[i][j];
            }
            map.put(id,map.getOrDefault(id,0)+val);
        }

        int[][] ans = new int[map.size()][2];
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            id = entry.getKey();
            val = entry.getValue();
            ans[idIndex][0] = id;
            ans[idIndex++][1] = val;
        }
        return ans;
    }
}