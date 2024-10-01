class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cookie = 0;
        int count = 0;
        int child = 0;
        while(cookie < s.length && child < g.length)
        {
            if(g[child] <= s[cookie])
            {
                count++;
                child++;
                cookie++;
            }
            else
            {
                cookie++;
            }
        }
        return count;
    }
}