class Solution 
{
    public boolean search(int[] nums, int num)
    {
        int low = 0, high = nums.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == num)
                return true;
            else if(nums[mid] < num)
                low = mid+1;
            else high = mid-1;
        }
        return false;
    }

    public boolean isLonely(int[] nums, int num)
    {
        int prev = num-1, next = num+1;
        return !search(nums,prev) && !search(nums,next);
    }

    public List<Integer> findLonely(int[] nums) 
    {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);

        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);

        for(int x : nums)
        {
            if(isLonely(nums,x) && (map.get(x) == 1))
                ans.add(x);
        }
        return ans;
    }
}