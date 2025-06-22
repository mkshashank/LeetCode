class Solution {
    public String[] divideString(String s, int k, char fill) 
    {
        int rem = s.length() % k;
        int missing = k - rem;
        String str = s;
        if(rem > 0)
        {
            StringBuilder sb = new StringBuilder(s);
            for(int i = 0; i < missing; i++)
                sb.append(fill);
            str = sb.toString();
        }    
        int count = k;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i += k, count += k)
        {
            list.add(str.substring(i,count));
        }
        String[] ans = new String[list.size()];
        for(int i = 0; i < ans.length; i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
}