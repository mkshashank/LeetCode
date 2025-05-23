class Solution 
{
    public int trap(int[] height) 
    {
        int leftMax = 0, rightMax = 0, total = 0;
        int n = height.length, l = 0, r = n-1;
        while(l < r)
        {
            if(height[l] <= height[r])
            {
                if(height[l] > leftMax)
                    leftMax = height[l];
                else
                    total += leftMax - height[l];
                l++;
            }
            else
            {
                if(height[r] > rightMax)
                    rightMax = height[r];
                else
                    total += rightMax - height[r];
                r--;
            }
        } 
        return total;
    }
}