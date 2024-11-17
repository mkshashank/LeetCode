class Solution {
    public int possibleStringCount(String word) {
        if(word == null || word.isBlank()) return 0;
        int cur = 0;
        int count = 1;
        for(int i = word.length()-1; i > 0; i--)
        {
            if(word.charAt(i) == word.charAt(i-1))
                cur++;
            else
            {
                count += cur;
                cur = 0;
            }
        }
        return count+cur;
    }
}