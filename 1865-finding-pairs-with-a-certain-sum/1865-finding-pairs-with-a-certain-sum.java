import java.util.*;

class FindSumPairs 
{
    int[] nums1, nums2;
    Map<Integer,Integer> map;

    public FindSumPairs(int[] nums1, int[] nums2) 
    {
        this.nums1 = nums1;
        this.nums2 = nums2;
        map = new HashMap<>();
        for(int x : nums2)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
    }
    
    public void add(int index, int val) 
    {
        int oldVal = nums2[index];

        map.put(oldVal,map.get(oldVal)-1);

        if(map.get(oldVal) == 0)
            map.remove(oldVal);
        
        nums2[index] += val;

        map.put(nums2[index],map.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) 
    {
        int count = 0;
        for(int i = 0; i < nums1.length; i++)
        {
            int remaining = tot - nums1[i];
            if(map.containsKey(remaining))
                count += map.get(remaining);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */