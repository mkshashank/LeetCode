class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        boolean[] composites = new boolean[n];
        int count = 0;
        for(int i = 2; i < Math.sqrt(n); i++)
        {
            if(composites[i] == false)
            {
                for(int j = i*i; j < n; j += i)
                {
                    composites[j] = true;
                }
            }
        }
        for(int i = 2; i < composites.length; i++)
        {
            if(composites[i] == false)
                count++;
        }
        return count;
    }
}