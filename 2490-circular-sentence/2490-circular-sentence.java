class Solution {
    public boolean isCircularSentence(String sentence) 
    {
        int n = sentence.length();
        if(n == 0) return false;
        
        String[] arr = sentence.split(" ");
        if(arr[0].charAt(0) != arr[arr.length-1].charAt(arr[arr.length-1].length()-1)) return false;
        for(int i = 0; i < arr.length-1; i++)
        {
            String curStr = arr[i];
            String nextStr = arr[i+1];
            int len = curStr.length();
            if(curStr.charAt(len-1) != nextStr.charAt(0))
                return false;
        }
        return true;
    }
}