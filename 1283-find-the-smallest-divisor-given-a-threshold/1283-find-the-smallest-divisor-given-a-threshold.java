class Solution 
{
    public int sum(int[] nums, int divisor)
    {
        int total = 0;
        for(int x : nums)
            total += Math.ceil(x/(double)divisor);
        return total;
    }

    public int smallestDivisor(int[] nums, int threshold) 
    {
        int low = 0, high = 0;
        for(int x : nums)
        {
            low = Math.min(low,x);
            high = Math.max(high,x);
        }
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(sum(nums,mid) <= threshold)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}