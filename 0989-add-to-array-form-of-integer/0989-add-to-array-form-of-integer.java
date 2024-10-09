class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> al = new ArrayList<Integer>();
        int carry = 0, i = num.length - 1, sum = 0, unit = 0;
        while(i >= 0 || k > 0)
        {
            sum = carry;
            if(i >= 0)
            {
                sum = carry + num[i];
                i--;
            }
            sum += k % 10;
            k /= 10;
            unit = sum % 10;
            carry = sum / 10;
            al.add(unit);
        }
        if(carry > 0)
        {
            al.add(1);
        }
        Collections.reverse(al);
        return al;
    }
}