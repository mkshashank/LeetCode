class Solution {
    public String convertDateToBinary(String date) 
    {
        StringBuilder sb = new StringBuilder();
        String[] arr = date.split("-");
        for(String s : arr)
        {
            int val = Integer.parseInt(s);
            sb.append(Integer.toBinaryString(val));
            sb.append("-");
        }    
        return sb.toString().substring(0,sb.length()-1);
    }
}