class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int aliceSum = 0, bobSum = 0;
        for(int i = 0; i < piles.length/2; i++)
            bobSum += piles[i];
        for(int i = piles.length/2; i < piles.length; i++)
            aliceSum += piles[i];
        return aliceSum > bobSum;
    }
}