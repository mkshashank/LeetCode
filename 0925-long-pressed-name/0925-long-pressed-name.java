class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0, n = name.length(), m = typed.length();
        while(i < n)
        {
            int counti = 0, countj = 0;
            char c = name.charAt(i);
            while(i < n && c == name.charAt(i))
            {
                counti++;
                i++;
            }
            while(j < m && c == typed.charAt(j))
            {
                countj++;
                j++;
            }
            if(counti > countj)
                return false;
        }
        if(j != m) return false;
        return true;
    }
}