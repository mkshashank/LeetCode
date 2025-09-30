class Solution 
{
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i < arr.length; i++)
        {
            mini = Math.min(mini, arr[i]-arr[i-1]);
        }

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i]-arr[i-1] == mini)
            {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }

        return ans;
    }
}