class Solution {
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int consumed = numBottles, empty = 0;
        while(numBottles >= numExchange)
        {
            numBottles = numBottles / numExchange;
            empty = numBottles % numExchange;
            consumed += numBottles;
            numBottles += empty;
        }
        return consumed;
    }
}