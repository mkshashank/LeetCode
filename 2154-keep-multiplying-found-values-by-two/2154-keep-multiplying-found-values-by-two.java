class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans = original;
        Set<Integer> hs = new HashSet<Integer>();
        for(int x : nums)
        {
            hs.add(x);
        }
        if(!hs.contains(original)) return original;
        do
        {
            ans *= 2;
        }while(hs.contains(ans));
        return ans;
    }
}