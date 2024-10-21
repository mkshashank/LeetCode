class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i = 0; i < s.length(); i++)
        {
            if((s = s.substring(1) + s.charAt(0)).equals(goal))
                return true;
        }
        return false;
    }
}