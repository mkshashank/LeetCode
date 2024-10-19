class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String vowels = "aeiou";
        char[] arr = s.toCharArray();
        int count1 = 0, count2 = 0;
        for(int i = 0, j = (s.length()/2); i < (s.length()/2) && j < s.length(); i++,j++)
        {
            if(vowels.contains(s.charAt(i)+""))
                count1++;
            if(vowels.contains(s.charAt(j)+""))
                count2++;
        }
        return count1 == count2;
    }
}