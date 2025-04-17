class Solution 
{
    public boolean checkString(String s) 
    {
        boolean flag = true;
        int j = -1;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'b')
            {
                j = i;
                flag = false;
                break;
            }
        }
        if(j != -1)
        {
            for(int i = j; i < s.length(); i++)
            {
                if(s.charAt(i) == 'a')
                    return false;
            }
        }
        return true;
    }
}