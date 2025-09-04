class Solution 
{
    public int findClosest(int x, int y, int z) 
    {
        int status1 = Math.abs(z-x);
        int status2 = Math.abs(z-y);  
        if(status1 == status2) return 0;
        return status1 < status2 ? 1 : 2; 
    }
}