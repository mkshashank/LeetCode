class Solution {
    public String reformat(String s) {
        if(s.length() == 1) return s;
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
                letters.append(s.charAt(i));
            if(Character.isDigit(s.charAt(i)))
                numbers.append(s.charAt(i));
        }
        if(!(letters.length() > 0 && numbers.length() > 0)) return "";
        int i = 0, j = 0;
        if(letters.length() > numbers.length())
        {
            while(i < letters.length() || j < numbers.length())
            {
                if(i < letters.length())
                    ans.append(letters.charAt(i++));
                if(j < numbers.length())
                    ans.append(numbers.charAt(j++));
            }
        }
        else
        {
            while(i < letters.length() || j < numbers.length())
            {
                if(j < numbers.length())
                    ans.append(numbers.charAt(j++));
                if(i < letters.length())
                    ans.append(letters.charAt(i++));
            }
        }
        
        return ans.toString();
    }
}