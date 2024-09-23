class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1 && Character.isUpperCase(word.charAt(0))) 
            return true;
        if(Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1)))
        {
            int i = 2;
            while(i < word.length())
            {
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
                i++;
            }
            return true;
        }

        else if(Character.isLowerCase(word.charAt(0)))
        {
            int i = 1;
            while(i < word.length())
            {
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
                i++;
            }
            return true;
        }

        else if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1)))
        {
            int i = 0;
            while(i < word.length())
            {
                if(Character.isLowerCase(word.charAt(i)))
                    return false;
                i++;
            }
            return true;
        }
        return false;
    }
}