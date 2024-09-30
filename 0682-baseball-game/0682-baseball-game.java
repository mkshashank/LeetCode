class Solution {
    public int calPoints(String[] operations) {
        List<Integer> al = new ArrayList<Integer>();
        int ans = 0;
        int count = -1;
        for(int i = 0; i <  operations.length; i++)
        {
            if(operations[i].charAt(0) == 'C')
            {
                al.remove(al.get(count--));
            }
            else if(operations[i].charAt(0) == 'D')
            {
                al.add(al.get(count) * 2);
                count++;
            }
            else if(operations[i].charAt(0) == '+')
            {
                al.add(al.get(count) + al.get(count-1));
                count++;
            }
            else if(operations[i].charAt(0) != 'C' && operations[i].charAt(0) != 'D' && operations[i].charAt(0) != '+')
            {
                al.add(Integer.parseInt(operations[i]));
                count++;
            }
        }
        for(int x : al)
        {
            ans += x;
        }
        return ans;
    }
}