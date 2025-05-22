class Solution 
{
    public boolean isPossible(int[] nums, int k, int maxItems)
    {
        int painters = 1, total = 0;
        for(int x : nums)
        {
            if(x > maxItems) return false;
            if(total + x <= maxItems)
                total += x;
            else
            {
                painters++;
                total = x;
            }
        }
        return painters <= k;
    }

    public int splitArray(int[] nums, int k) 
    {
        int n = nums.length, low = 0, high = 0;
        if(k > n) return -1;
        for(int x : nums)
        {
            low = Math.max(low,x);
            high += x;
        } 

        while(low <= high)
        {
            int mid = (low+high)/2;
            if(isPossible(nums,k,mid))
                high = mid-1;
            else
                low = mid+1;
        }
        
        return low;
    }
}