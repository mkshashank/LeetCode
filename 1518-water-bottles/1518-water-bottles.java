class Solution {
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int consumed = numBottles, empty = numBottles;
        while(empty >= numExchange)
        {
            int newBottles = empty / numExchange;
            consumed += newBottles;
            empty = empty % numExchange + newBottles;
        }
        return consumed;
    }
}