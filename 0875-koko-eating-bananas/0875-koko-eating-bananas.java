class Solution 
{
    public int findMax(int[] piles)
    {
        int ans = -1;
        for(int x : piles)
        {
            ans = Math.max(x,ans);
        }
        return ans;
    }

    public int totalHours(int[] piles, int mid)
    {
        int total = 0;
        for(int x : piles)
            total += Math.ceil((double)x/(double)mid);
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) 
    {
        int low = 1, high = findMax(piles);
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(totalHours(piles,mid) <= h)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}