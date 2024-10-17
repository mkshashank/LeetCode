class Solution {
    public int countAsterisks(String s) {
        int pipe = 1, count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '|')
                pipe ^= 1;
            if(s.charAt(i) == '*' && pipe == 1)
                count++;
        }
        return count;
    }
}