class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> hm = new HashMap<String,Integer>();
        List<String> al = new ArrayList<String>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        for(int i = 0; i < str1.length; i++)
        {
            if(hm.containsKey(str1[i]))
            {
                hm.put(str1[i],hm.get(str1[i])+1);
            }
            else
            {
                hm.put(str1[i],1);
            }
        }

        for(int j = 0; j < str2.length; j++)
        {
            if(hm.containsKey(str2[j]))
            {
                hm.put(str2[j],hm.get(str2[j])+1);
            }
            else
            {
                hm.put(str2[j],1);
            }
        }

        Set<Map.Entry<String,Integer>> entry = hm.entrySet();
        for(Map.Entry<String,Integer> e : entry)
        {
            if(e.getValue() == 1)
                al.add(e.getKey());
        }

        String[] ans = new String[al.size()];

        for(int k = 0; k < al.size(); k++)
        {
            ans[k] = al.get(k);
        }
        return ans;
    }
}