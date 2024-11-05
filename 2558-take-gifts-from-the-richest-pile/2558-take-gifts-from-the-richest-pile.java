class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        for(int i = 0; i < k; i++)
        {
            int max = 0, maxIndex = 0;
            for(int j = 0; j < gifts.length; j++)
            {
                if(gifts[j] > max)
                {
                    max = gifts[j];
                    maxIndex = j;
                }
            }
            gifts[maxIndex] = (int) Math.sqrt(max);
        }

        for(int x : gifts)
            ans += x;
        
        return ans;
    }
}