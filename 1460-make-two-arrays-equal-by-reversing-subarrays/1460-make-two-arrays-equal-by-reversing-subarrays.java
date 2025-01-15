class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> targetMap = new HashMap<>();
        Map<Integer,Integer> arrMap = new HashMap<>();

        for(int x : target)
            targetMap.put(x,targetMap.getOrDefault(x,0)+1);

        for(int y : arr)
            arrMap.put(y,arrMap.getOrDefault(y,0)+1);

        for(Map.Entry<Integer,Integer> targetEntry : targetMap.entrySet())
        {
            int key = targetEntry.getKey(), value = targetEntry.getValue();
            if(!arrMap.containsKey(key))
                return false;
            else if(arrMap.get(key) != value)
                return false;
        }

        return true;
    }
}