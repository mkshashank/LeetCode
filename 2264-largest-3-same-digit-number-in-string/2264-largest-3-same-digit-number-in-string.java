class Solution 
{
    public String largestGoodInteger(String num) 
    {
        int[] arr = new int[10];
        int prevDigit = Integer.MIN_VALUE, count = 0;
        for(char c : num.toCharArray())
        {
            int i = Integer.valueOf(c-'0');
            if(prevDigit == i)
            {
                count++;
                if(count == 3)
                    arr[i] = 1;
            }
            else
            {
                prevDigit = i;
                count = 1;
            }
        }

        String ans = "";

        for(int i = 9; i >= 0; i--)
        {
            if(arr[i] == 1)
            {
                ans = i + "" + i + "" + i;
                break;
            }
        }
        return ans;
    }
}