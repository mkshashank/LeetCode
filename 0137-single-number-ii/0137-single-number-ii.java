import java.util.Map.Entry;
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],true);
            }
            else
            {
                map.put(nums[i],false);
            }
        }
        for(Entry<Integer, Boolean> entry : map.entrySet()) {
            if (entry.getValue() == false) {
                return entry.getKey();
            }
        }
        return 0;
    }
}