class Solution 
{
    public boolean isAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length()) return false;
        int[] arr = new int[26];
        for(char c : s1.toCharArray())
            arr[c-'a']++;
        for(char c : s2.toCharArray())
            arr[c-'a']--;
        for(int x : arr)
            if(x != 0)
                return false;
        return true;
    }

    public boolean doesntContain(List<List<String>> ans, String str)
    {
        for(int i = 0; i < ans.size(); i++)
        {
            for(String s : ans.get(i))
                if(s.equals(str))
                    return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < strs.length; i++)
        {
            List<String> list = new ArrayList<>();
            if(doesntContain(ans,strs[i]))
                list.add(strs[i]);
            for(int j = i+1; j < strs.length; j++)
            {
                if(isAnagram(strs[i],strs[j]) && doesntContain(ans,strs[j]))
                    list.add(strs[j]);
            }
            if(list.size() != 0)
                ans.add(list);
        }
        return ans;
    }
}