class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);
        int sum = 0, count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];

            int rem = sum - k;

            count += map.getOrDefault(rem,0);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}