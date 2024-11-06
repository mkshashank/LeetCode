class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length == 0) return 0;
        int largest, second, third;
        largest = second = third = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            int cur = nums[i];

            if(cur > largest)
            {
                int temp1 = largest;
                largest = cur;
                int temp2 = second;
                second = temp1;
                third = temp2;
            }
            else if(cur > second)
            {
                if(cur < largest)
                {
                    int temp = second;
                    second = cur;
                    third = temp;
                }
                else if(cur > third && cur != second && cur != largest)
                    third = cur;
            }
            else if(cur > third && cur != second && cur != largest)
                third = cur;
        }
        if(third == Integer.MIN_VALUE)  return largest;
        return third;
    }
}