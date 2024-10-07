class Solution {
    public String removeAB(String s)
    {
        String[] ab = s.split("AB");
        s = "";
        for(int i = 0; i < ab.length; i++)
        {
            s += ab[i];
        }
        return s;
    }
    public String removeCD(String s)
    {
        String[] cd = s.split("CD");
        s = "";
        for(int i = 0; i < cd.length; i++)
        {
            s += cd[i];
        }
        return s;
    }
    public int minLength(String s) {
        while(s.contains("AB") || s.contains("CD"))
        {
            if(s.contains("AB"))
            {
                s = removeAB(s);
            }
            if(s.contains("CD"))
            {
                s = removeCD(s);
            }
        }
        return s.length();
    }
}