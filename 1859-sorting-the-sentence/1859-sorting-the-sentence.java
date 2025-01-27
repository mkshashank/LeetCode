class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = s.split(" ");
        String[] arr = new String[strArr.length+1];
        for(String str : strArr)
        {
            int digit = str.charAt(str.length()-1) - '0';
            String s1 = str.substring(0,str.length()-1);
            arr[digit] = s1;
        }

        for(int i = 1; i < arr.length; i++)
            sb.append(arr[i] + " ");

        return sb.toString().trim();
    }
}