class Solution 
{
    public int[] getLeftMax(int[] arr, int n)
    {
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for(int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);

        return leftMax;
    }

    public int[] getRightMax(int[] arr, int n)
    {
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);

        return rightMax;
    }

    public int trap(int[] height) 
    {
        int n = height.length, ans = 0;

        if(n == 0) return 0;
        
        int[] leftMax  = getLeftMax(height,n);
        int[] rightMax = getRightMax(height,n);

        for(int i = 0; i < n; i++)
            ans += Math.min(leftMax[i],rightMax[i]) - height[i];
        
        return ans;
    }
}