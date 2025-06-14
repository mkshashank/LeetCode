class Solution 
{
    public int minMaxDifference(int num) 
    {
        String str = Integer.toString(num);
        char[] maxChars = str.toCharArray();
        char[] minChars = str.toCharArray();

        char repl = ' ';

        for(char c : maxChars)
        {
            if(c != '9')
            {
                repl = c;
                break;
            }
        }

        for(int i = 0; i < maxChars.length; i++)
        {
            if(maxChars[i] == repl)
                maxChars[i] = '9';
        }

        repl = minChars[0];
        for(int i = 0; i < minChars.length; i++)
        {
            if(minChars[i] == repl)
                minChars[i] = '0';
        }

        int minVal = Integer.parseInt(new String(minChars));
        int maxVal = Integer.parseInt(new String(maxChars));

        return maxVal - minVal;
    }
}