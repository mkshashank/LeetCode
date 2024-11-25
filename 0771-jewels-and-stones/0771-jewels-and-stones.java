class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> stoneMap = new HashMap<Character,Integer>();
        int count = 0;
        for(char c : stones.toCharArray())
        {
            stoneMap.put(c,stoneMap.getOrDefault(c,0)+1);
        }
        for(char c : jewels.toCharArray())
        {
            if(stoneMap.containsKey(c))
                count += stoneMap.get(c);
        }
        return count;
    }
}