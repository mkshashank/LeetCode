class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        List<String> al = new ArrayList<String>();
        for(int i = 2; i < arr.length; i++)
        {
            if(arr[i-1].equals(second) && arr[i-2].equals(first))
            {
                al.add(arr[i]);
            }
        }
        String[] ans = new String[al.size()];
        for(int i = 0; i < ans.length; i++)
        {
            ans[i] = al.get(i);
        }
        return ans;
    }
}