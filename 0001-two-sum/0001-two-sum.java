class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] res = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
            map.put(i,nums[i]);

        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        while(i < j)
        {
            if(nums[i] + nums[j] > target)
                j--;
            else if(nums[i] + nums[j] < target)
                i++;
            else
            {
                int num1 = nums[i];
                int num2 = nums[j];
                for(Map.Entry<Integer,Integer> entry : map.entrySet())
                {
                    if(entry.getValue() == num1)
                        res[0] = entry.getKey();
                }
                for(Map.Entry<Integer,Integer> entry : map.entrySet())
                {
                    if(entry.getValue() == num2 && entry.getKey() != res[0])
                        res[1] = entry.getKey();
                }
                return res;
            }
        }
        return res;
    }
}