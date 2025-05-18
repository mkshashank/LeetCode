class Solution 
{
    public int totalDays(int[] weights, int capacity)
    {
        int days = 1, load = 0;
        for(int i = 0; i < weights.length; i++)
        {
            if(load+weights[i] > capacity)
            {
                days += 1;
                load = weights[i];
            }
            else
            {
                load += weights[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) 
    {
        int arrSum = 0, arrMax = 0;
        for(int x : weights)
        {
            arrSum += x;
            arrMax = Math.max(arrMax,x);
        }
        // for(int i = arrMax; i <= arrSum; i++)
        // {
        //     if(totalDays(weights,i) <= days)
        //         return i;
        // }
        int low = arrMax, high = arrSum;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(totalDays(weights,mid) <= days)
                high = mid-1;
            else 
                low = mid+1;
        }
        return low;
    }
}