class Solution 
{
    public int finalValueAfterOperations(String[] operations) 
    {
        int total = 0;
        Map<String,Integer> map = new HashMap<>();
        map.put("++X",1);
        map.put("X++",1);
        map.put("--X",-1);
        map.put("X--",-1);

        for(String str : operations)
        {
            total += map.get(str);
        }

        return total;
    }
}