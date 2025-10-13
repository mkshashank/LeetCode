class Solution 
{
    public boolean isAnagram(String str1, String str2)
    {
        int[] arr = new int[26];
        for(char c : str1.toCharArray())
            arr[c-'a']++;
        for(char c : str2.toCharArray())
            arr[c-'a']--;

        for(int x : arr)
            if(x != 0)
                return false;
        
        return true;
    }

    public List<String> removeAnagrams(String[] words) 
    {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        for(int i = 1; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                if(isAnagram(words[j],words[j-1]))
                {
                    for(int k = j; k < n-1; k++)
                    {
                        words[k] = words[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }    

        for(int i = 0; i < n; i++)
        {
            ans.add(words[i]);
        }

        return ans;

    }
}