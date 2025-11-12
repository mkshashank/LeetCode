class Solution 
{
    public List<Integer> findLonely(int[] nums) 
    {
        List<Integer> ans = new ArrayList<>();
        int maxi = 0;
        for(int x : nums)
            maxi = Math.max(maxi,x);

        int[] freq = new int[maxi+2];

        for(int x : nums)
        {
            freq[x]++;
        }    

        for(int num : nums)
        {
            if(freq[num] == 1 && (num == 0 || freq[num-1] == 0) && freq[num+1] == 0)
                ans.add(num);
        }
        return ans;
    }
}