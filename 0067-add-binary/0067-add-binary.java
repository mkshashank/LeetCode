class Solution {
    public String addBinary(String a, String b) {
        int carry = 0, i = a.length()-1, j = b.length()-1;
        StringBuilder ans = new StringBuilder();
        while(i >= 0 && j >= 0)
        {
            if(a.charAt(i) == '0' && b.charAt(j) == '0' && carry == 0)
            {
                ans.append("0");
                i--; j--;
            }
            else if(a.charAt(i) == '0' && b.charAt(j) == '1' && carry == 0)
            {
                ans.append("1");
                i--; j--;
            }
            else if(a.charAt(i) == '1' && b.charAt(j) == '0' && carry == 0)
            {
                ans.append("1");
                i--; j--;
            }
            else if(a.charAt(i) == '1' && b.charAt(j) == '1' && carry == 0)
            {
                ans.append("0");
                carry = 1;
                i--; j--;
            }
            else if(a.charAt(i) == '0' && b.charAt(j) == '0' && carry == 1)
            {
                ans.append("1");
                carry = 0;
                i--; j--;
            }
            else if(a.charAt(i) == '0' && b.charAt(j) == '1' && carry == 1)
            {
                ans.append("0");
                i--; j--;
            }
            else if(a.charAt(i) == '1' && b.charAt(j) == '0' && carry == 1)
            {
                ans.append("0");
                i--; j--;
            }
            else if(a.charAt(i) == '1' && b.charAt(j) == '1' && carry == 1)
            {
                ans.append("1");
                i--; j--;
            }
        }
        while(i >= 0)
        {
            if(a.charAt(i) == '0' && carry == 0)
            {
                ans.append("0");
                i--;
            }
            else if(a.charAt(i) == '0' && carry == 1)
            {
                ans.append("1");
                carry = 0;
                i--;
            }
            else if(a.charAt(i) == '1' && carry == 0)
            {
                ans.append("1");
                i--;
            }
            else if(a.charAt(i) == '1' && carry == 1)
            {
                ans.append("0");
                i--;
            }
        }
        while(j >= 0)
        {
            if(b.charAt(j) == '0' && carry == 0)
            {
                ans.append("0");
                j--;
            }
            else if(b.charAt(j) == '0' && carry == 1)
            {
                ans.append("1");
                carry = 0;
                j--;
            }
            else if(b.charAt(j) == '1' && carry == 0)
            {
                ans.append("1");
                j--;
            }
            else if(b.charAt(j) == '1' && carry == 1)
            {
                ans.append("0");
                j--;
            }
        }
        if(carry == 1)
            ans.append("1");
        return ans.reverse().toString();
    }
}