class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        int count = 0, maxi = 0;
        int[] arr = new int[101];

        for(int x : nums)
            arr[x]++;

        for(int x : arr)
            maxi = Math.max(x,maxi);

        for(int i = 1; i < arr.length; i++)
            if(maxi == arr[i])
                count += maxi;
        
        return count;
    }
}