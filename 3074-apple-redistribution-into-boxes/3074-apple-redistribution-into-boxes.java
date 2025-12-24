class Solution 
{
    public int minimumBoxes(int[] apple, int[] capacity) 
    {
        int count = 0, sum = 0;
        Arrays.sort(capacity);
        for(int x : apple)
            sum += x;

        int i = capacity.length-1;

        while(i >= 0 && sum > 0)
        {
            sum -= capacity[i--];
            count++;
        }

        return count;
    }
}