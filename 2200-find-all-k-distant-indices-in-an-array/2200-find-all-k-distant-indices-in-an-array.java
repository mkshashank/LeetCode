class Solution 
{
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) 
    {
        List<Integer> indexList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == key)
                indexList.add(i);
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            for(int x : indexList)
            {
                if(Math.abs(i-x) <= k)
                {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}