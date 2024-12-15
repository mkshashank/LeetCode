class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < p.length(); i++)
        {
            hm.put(p.charAt(i),hm.getOrDefault(p.charAt(i),0)+1);
        }

        int i = 0, j = 0, count = hm.size();
        while(j < s.length())
        {
            char c = s.charAt(j);
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)-1);
                if(hm.get(c) == 0)
                    count--;
            }
            if(j-i+1 == p.length())
            {
                if(count == 0)
                    ans.add(i);
                char ch1 = s.charAt(i);
                if(hm.containsKey(ch1))
                {
                    hm.put(ch1,hm.get(ch1)+1);
                    if(hm.get(ch1) == 1)
                        count++;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}