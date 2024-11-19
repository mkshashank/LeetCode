class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> hm = new HashMap<String,Integer>();
        List<String> al = new ArrayList<String>();
        int leastIndexSum = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++)
        {
            hm.put(list1[i],i);
        }
        
        for(int j = 0; j < list2.length; j++)
        {
            if(hm.containsKey(list2[j]))
            {
                int indexSum = hm.get(list2[j])+j;
                if((indexSum) < leastIndexSum)
                {
                    al.clear();
                    al.add(list2[j]);
                    leastIndexSum = indexSum;
                }
                else if(indexSum == leastIndexSum)
                    al.add(list2[j]);
            }
        }
        return al.toArray(new String[0]);
    }
}