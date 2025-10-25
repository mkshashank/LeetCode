class Solution {
    public int totalMoney(int n) 
    {
        int monday = 1, total = 0, count = 0, curWeek = 1;

        for(int i = 1; i <= n; i++)
        {
            if(count == 7)
            {
                monday++;
                curWeek = monday;
                count = 0;
            }
            total += curWeek;
            curWeek++;
            count++;
        } 
        return total;   
    }
}