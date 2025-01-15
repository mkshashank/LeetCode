class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int x : target)
            max = Math.max(max,x);
        for(int x : arr)
            max = Math.max(max,x);  

        int[] hashArr = new int[max+1];

        for(int x : target)
            hashArr[x]++;
        
        for(int x : arr)
            hashArr[x]--;

        for(int x : hashArr)
            if(x != 0)
                return false;
        return true;
    }
}