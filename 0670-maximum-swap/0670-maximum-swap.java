class Solution {
    public int maximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;
        char maxEle = numArr[n-1];
        int maxInd = n-1;
        int swpInd1 = -1, swpInd2 = -1;
        for(int i = n-2; i >= 0; i--)
        {
            if(numArr[i] > maxEle)
            {
                maxEle = numArr[i];
                maxInd = i;
            }
            else if(numArr[i] < maxEle)
            {
                swpInd1 = i;
                swpInd2 = maxInd;
            }
        }
        if(swpInd1 != -1)
        {
            char temp = numArr[swpInd1];
            numArr[swpInd1] = numArr[swpInd2];
            numArr[swpInd2] = temp;
        }
        return Integer.parseInt(new String(numArr));
    }
}