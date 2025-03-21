class Solution {
    public String compressedString(String word) 
    {
        StringBuilder ans = new StringBuilder();
        char c = word.charAt(0);
        int count = 1;
        for(int i = 1; i < word.length(); i++)
        {
            if(word.charAt(i) == c)
                count++;
            else
            {
                while(count > 9)
                {
                    ans.append("9").append(c);
                    count -= 9;
                }
                ans.append(count);
                ans.append(c);
                count = 1;
                c = word.charAt(i);
            }
        }
        while(count > 9)
        {
            ans.append("9").append(c);
            count -= 9;
        }
        ans.append(count);
        ans.append(c);
        return ans.toString();
    }
}