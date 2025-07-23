class Solution 
{
    public boolean checkAlmostEquivalent(String word1, String word2) 
    {
        int[] hash = new int[26];
        for(char c : word1.toCharArray())
            hash[c-'a']++;
        for(char c : word2.toCharArray())
            hash[c-'a']--;
        for(int x : hash)
            if(Math.abs(x) > 3)
                return false;
        return true;    
    }
}