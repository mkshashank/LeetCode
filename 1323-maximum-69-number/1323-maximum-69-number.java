class Solution {
    public int maximum69Number (int num) 
    {
        List<Integer> list = new ArrayList<>();
        int temp = num;
        boolean changed = false;
        while(temp > 0)
        {
            list.add(temp % 10);
            temp /= 10;
        }    
        for(int i = list.size()-1; i >= 0; i--)
        {
            if(list.get(i) == 6)
            {
                list.remove(i);
                list.add(i,9);
                changed = true;
                break;
            }
        }
        if(changed)
        {
            int res = 0;
            for(int i = list.size()-1; i >= 0; i--)
            {
                res = res * 10 + list.get(i);
            }
            return res;
        }
        return num;
    }
}