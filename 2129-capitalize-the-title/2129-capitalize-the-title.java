class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        String[] ans = new String[arr.length];
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].length() < 3)
            {
                ans[i] = arr[i].toLowerCase();
            }
            else
            {
                ans[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }
        }
        for(int j = 0; j < ans.length; j++)
        {
            sb.append(ans[j]+" ");
        }
        return sb.toString().trim();
    }
}