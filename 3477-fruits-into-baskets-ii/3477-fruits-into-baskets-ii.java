class Solution 
{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        int count = 0;
        List<Integer> basketList = new ArrayList<>();
        for(int x : baskets)
            basketList.add(x);
        
        for(int i = 0; i < fruits.length; i++)
        {
            if(basketList.size() == 0)
                break;
            for(int x : basketList)
            {
                if(fruits[i] <= x)
                {
                    basketList.remove(Integer.valueOf(x));
                    count++;
                    break;
                }
            }
        }

        return fruits.length - count;
    }
}