class Solution 
{
    public boolean checkPalindrome(String str, int i, int j)
    {
        if(i >= j) return true;
        if(str.charAt(i) != str.charAt(j))
            return false;
        i++;
        j--;
        return checkPalindrome(str, i, j);
    }

    public boolean isPalindrome(String s) 
    {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(Character.isLetterOrDigit(c))
                sb.append(c);
        }    
        return checkPalindrome(sb.toString(),0,sb.length()-1);
    }
}