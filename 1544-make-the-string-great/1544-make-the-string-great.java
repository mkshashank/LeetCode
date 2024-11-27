class Solution {
    public String makeGood(String s) {
        char[] arr = s.toCharArray();
        int k = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(k > 0 && Math.abs(arr[k-1] - arr[i]) == 32)
                k--;
            else
            {
                arr[k] = arr[i];
                k++;
            }
        }
        return new String(arr,0,k);
    }
}