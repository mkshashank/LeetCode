class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        outer:for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words[i].length(); j++)
            {
                if(allowed.contains(words[i].charAt(j)+""))
                    continue;
                else
                    continue outer;
            }
            count++;
        }
        return count;
    }
}