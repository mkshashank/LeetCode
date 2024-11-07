class Solution {
    public int maximumProduct(int[] nums) {
        Integer largest = null, second = null, third = null;
        Integer smallest = null, secondSmallest = null;
        for(int i = 0; i < nums.length; i++)
        {
            int cur = nums[i];
            if(largest == null || cur >= largest)
            {
                third = second;
                second = largest;
                largest = cur;
            }
            else if(second == null || cur >= second)
            {
                third = second;
                second = cur;
            }
            else if(third == null || cur >= third)
                third = cur;
            
            if(smallest == null || cur <= smallest)
            {
                secondSmallest = smallest;
                smallest = cur;
            }
            else if(secondSmallest == null || cur <= secondSmallest)
                secondSmallest = smallest;
        }
        int product1 = largest * second * third;
        int product2 = largest * smallest * secondSmallest;
        
        return Math.max(product1,product2);
    }
}