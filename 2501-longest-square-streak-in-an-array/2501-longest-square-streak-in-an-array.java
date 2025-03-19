class Solution {
    public int longestSquareStreak(int[] nums) 
    {
        int maxi = 0;
        Set<Integer> set = new HashSet<>();
        for(int x : nums)
            set.add(x);

        for(int x : nums)
        {
            int num = x;
            int count = 0;
            while(set.contains(num))
            {
                count++;
                if (num > 46340) break;
                num *= num;
            }
            maxi = Math.max(maxi,count);
        }    
        return maxi <= 1 ? -1 : maxi;
    }
}