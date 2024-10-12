class Solution {
    public int maxPower(String s) {
        if(s.isBlank()) return 0;
        char[] arr = s.toCharArray();
        int count = 1, max = 1;
        for(int i = arr.length-1; i > 0; i--)
        {
            if(arr[i-1] == arr[i])
            {
                count++;
                if(count > max) max = count;
            }
            else
            {
                count = 1;
            }
        }
        return max;
    }
}