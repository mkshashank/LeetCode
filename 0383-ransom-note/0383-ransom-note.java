class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransomNoteMap = new HashMap<Character,Integer>();
        Map<Character,Integer> magazineMap = new HashMap<Character,Integer>();
        for(int i = 0; i < ransomNote.length(); i++)
        {
            if(ransomNoteMap.containsKey(ransomNote.charAt(i)))
            {
                ransomNoteMap.put(ransomNote.charAt(i),ransomNoteMap.get(ransomNote.charAt(i))+1);
            }
            else
            {
                ransomNoteMap.put(ransomNote.charAt(i),1);
            }
        }
        for(int i = 0; i < magazine.length(); i++)
        {
            if(magazineMap.containsKey(magazine.charAt(i)))
            {
                magazineMap.put(magazine.charAt(i),magazineMap.get(magazine.charAt(i))+1);
            }
            else
            {
                magazineMap.put(magazine.charAt(i),1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++)
        {
            if(ransomNoteMap.get(ransomNote.charAt(i)) != magazineMap.get(ransomNote.charAt(i)))
                return false;
        }
        return true;
    }
}