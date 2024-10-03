class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int rank = 1;
        int[] copy = arr.clone();
        Arrays.sort(copy);
        HashMap<Integer,Integer> rankMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < copy.length; i++)
        {
            if(!rankMap.containsKey(copy[i]))
            {
                rankMap.put(copy[i],rank++);
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}