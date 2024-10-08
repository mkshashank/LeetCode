class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
        for(int i = 0; i < word1.length; i++)
        {
            s1.append(word1[i]);
        }
        for(int j = 0; j < word2.length; j++)
        {
            s2.append(word2[j]);
        }
        if(s1.length() != s2.length()) return false;
        char[] str1 = s1.toString().toCharArray();
        char[] str2 = s2.toString().toCharArray();
        for(int i = 0; i < str1.length; i++)
        {
            if(str1[i] != str2[i])
                return false;
        }
        return true;
    }
}