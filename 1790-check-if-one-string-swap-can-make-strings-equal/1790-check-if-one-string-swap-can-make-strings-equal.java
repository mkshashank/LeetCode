class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int char1 = -1, char2 = -1, count = 0;
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                count++;

                if(count > 2) return false;

                if(char1 == -1)
                    char1 = i;
                else
                    char2 = i;
            }
        }

        return count == 2 && s1.charAt(char1) == s2.charAt(char2) && s2.charAt(char1) == s1.charAt(char2);
    }
}