class Solution 
{
    public void backTrack(List<List<Integer>> result, List<Integer> temp, int[] nums)
    {
        if(temp.size() == nums.length)
        {
            result.add(new ArrayList(temp));
            return;
        }
        for(int x : nums)
        {
            if(temp.contains(x)) continue;

            temp.add(x);

            backTrack(result,temp,nums);

            temp.remove(temp.size()-1);
        }
    }
    

    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result,new ArrayList<>(), nums);
        return result;
    }
}