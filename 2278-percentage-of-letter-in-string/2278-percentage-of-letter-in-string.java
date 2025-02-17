class Solution {
    public int percentageLetter(String s, char letter) 
    {
        double count = 0;
        for(char c : s.toCharArray())
            if(c == letter)
                count++;
        return (int)(count/s.length() * 100);    
    }
}