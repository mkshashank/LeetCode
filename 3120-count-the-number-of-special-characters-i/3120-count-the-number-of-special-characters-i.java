class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        Set<Character> lowerCaseSet = new HashSet<Character>();
        Set<Character> upperCaseSet = new HashSet<Character>();
        for(char c : word.toCharArray())
        {
            if(Character.isLowerCase(c))
                lowerCaseSet.add(c);
            else
                upperCaseSet.add(c);
        }
        for(char c : lowerCaseSet)
        {
            if(upperCaseSet.contains(Character.toUpperCase(c)))
                count++;
        }
        return count;
    }
}