class Solution {
    public char repeatedCharacter(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),1);
            }
            else if(hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i)) == 1)
            {
                return s.charAt(i);
            }
            else
            {
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
        }
        return 0;
    }
}