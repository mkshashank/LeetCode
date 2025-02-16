class Solution {
    public int firstUniqChar(String s) 
    {
        int[] arr = new int[26]; 
        for(int i = 0; i < s.length(); i++)
        {
            int ind = s.charAt(i) - 'a';
            arr[ind]++;
        } 

        for(int i = 0; i < s.length(); i++)
        {
            int ind = s.charAt(i) - 'a';
            if(arr[ind] == 1)
                return i;
        }   
        return -1;
    }
}