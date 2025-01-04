class Solution {
    public static int countWords(String s)
    {
        int count = 1;
        
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == ' ')
                count++;

        return count;
    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(String s : sentences)
            max = Math.max(max,countWords(s));

        return max;
    }
}