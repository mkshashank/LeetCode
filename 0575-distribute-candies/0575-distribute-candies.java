class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> hs = new HashSet<Integer>();
        for(int x : candyType)
            hs.add(x);
        return Math.min(hs.size(),candyType.length/2);
    }
}