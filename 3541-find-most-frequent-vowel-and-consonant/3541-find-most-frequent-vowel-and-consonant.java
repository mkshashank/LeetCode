class Solution 
{
    public int maxFreqSum(String s) 
    {
        int vowelMax = 0, consonantMax = 0;
        Map<Character,Integer> vowels = new HashMap<>();
        Map<Character,Integer> consonants = new HashMap<>();
        for(char c : s.toCharArray())
        {
            switch(c)
            {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' : vowels.put(c,vowels.getOrDefault(c,0)+1);
                           break;
                default : consonants.put(c,consonants.getOrDefault(c,0)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry : vowels.entrySet())
        {
            vowelMax = Math.max(vowelMax,entry.getValue());
        }

        for(Map.Entry<Character,Integer> entry : consonants.entrySet())
        {
            consonantMax = Math.max(consonantMax,entry.getValue());
        }

        return vowelMax + consonantMax;
    }
}