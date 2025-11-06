class Solution 
{
    public void reverse(char[] arr, int i, int j)
    {
        if(i >= (arr.length/2)) return;
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr,++i,--j);
    }

    public void reverseString(char[] s) 
    {
        reverse(s, 0, s.length-1);
    }
}