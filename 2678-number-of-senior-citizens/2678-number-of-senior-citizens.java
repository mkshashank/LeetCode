class Solution {
    public int countSeniors(String[] details) 
    {
        if(details.length == 0) return 0;
        int startInd = details[0].length()-4;
        int endInd = details[0].length()-2;
        int count = 0;
        for(String s : details)
        {
            if(Integer.parseInt(s.substring(startInd,endInd)) > 60)
                count++;
        }
        return count;
    }
}