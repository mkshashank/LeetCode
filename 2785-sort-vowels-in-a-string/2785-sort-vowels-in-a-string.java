class Solution {

    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }

    public String sortVowels(String s) 
    {
        List<Character> vowels = new ArrayList<Character>();
        char[] arr = s.toCharArray();
        for(char c : arr)
            if(isVowel(c))
                vowels.add(c);

        Collections.sort(vowels);
        
        for(int i = 0; i < arr.length; i++)
        {
            if(isVowel(arr[i]))
                arr[i] = vowels.remove(0);
        }

        return new String(arr);
    }
}