class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++)
            map.put(numbers[i],i);
        
        for(int x : numbers)
        {
            int rem = target-x;
            if(map.containsKey(rem))
                return new int[]{map.get(x)+1,map.get(rem)+1};
        }

        return new int[]{0,0};
    }
}