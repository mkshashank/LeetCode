class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= word.indexOf(ch); i++)
        {
            sb.append(word.charAt(i));
        }
        sb.reverse();
        for(int j = word.indexOf(ch)+1; j < word.length(); j++)
        {
            sb.append(word.charAt(j));
        }
        return sb.toString();
    }
}