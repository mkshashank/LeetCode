class Solution 
{
    public boolean isPalindrome(String str)
    {
        int i = 0, j = str.length()-1;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }

    public String longestPalindrome(String s) 
    {
        int maxi = 0, n = s.length();
        String res = "";
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                String sub = s.substring(i,j+1);
                if(isPalindrome(sub) && sub.length() > maxi)
                {
                    res = sub;
                    maxi = sub.length();
                }
            }
        }
        return res;
    }
}