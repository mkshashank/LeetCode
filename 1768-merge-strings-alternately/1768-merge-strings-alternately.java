class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int m = word1.length(), n = word2.length();
        StringBuilder sb = new StringBuilder();
        while(i < m && j < n)
        {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        if(i < m && j == n)
        {
            sb.append(word1.substring(i));
        }
        if(j < n && i == m)
        {
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }
}