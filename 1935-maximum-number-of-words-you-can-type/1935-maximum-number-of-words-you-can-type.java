class Solution 
{
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        int count = 0;
        String[] strArr = text.split(" ");

        for(String str : strArr)
        {
            boolean possible = true;
            for(char c : brokenLetters.toCharArray())
            {
                if(str.contains(String.valueOf(c)))
                {
                    possible = false;
                    break;
                }
            }
            if(possible)
                count++;
        }  

        return count;
    }
}