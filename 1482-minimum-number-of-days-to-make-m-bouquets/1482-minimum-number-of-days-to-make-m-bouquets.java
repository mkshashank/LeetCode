class Solution 
{
    public boolean possible(int[] arr, int day, int m, int k)
    {
        int count = 0, noOfBouquets = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= day)
                count++;
            else
            {
                noOfBouquets += (count/k);
                count = 0;
            }
        }
        noOfBouquets += (count/k);
        return noOfBouquets >= m;
    }

    public int getMax(int[] arr)
    {
        int maxi = Integer.MIN_VALUE;
        for(int x : arr)
            maxi = Math.max(maxi,x);
        return maxi;
    }

    public int getMin(int[] arr)
    {
        int mini = Integer.MAX_VALUE;
        for(int x : arr)
            mini = Math.min(mini,x);
        return mini;
    }

    public int minDays(int[] bloomDay, int m, int k) 
    {
        int n = bloomDay.length, low = getMin(bloomDay), high = getMax(bloomDay);
        if((long)m*k > n) return -1;
        // for(int i = low; i <= high; i++)
        // {
        //     if(possible(bloomDay,i,m,k))
        //         return i;
        // }
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k))
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}