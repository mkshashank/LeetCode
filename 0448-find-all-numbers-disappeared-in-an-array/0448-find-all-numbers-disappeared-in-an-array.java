class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] numExists = new boolean[nums.length];
        List<Integer> ans = new LinkedList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            numExists[nums[i]-1] = true;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(numExists[i] == false)
            {
                ans.add(i+1);
            }
        }
        return ans;
    }
}