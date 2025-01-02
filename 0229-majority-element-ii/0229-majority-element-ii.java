class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(ans.size() == 0 || ans.get(0) != nums[i])
            {
                count = 0;
                for(int j = 0; j < nums.length; j++)
                {
                    if(nums[j] == nums[i])
                        count++;
                }
                if(count > (nums.length/3))
                    ans.add(nums[i]);
            }
            if(ans.size() == 2) break;
        }
        return ans;
    }
}