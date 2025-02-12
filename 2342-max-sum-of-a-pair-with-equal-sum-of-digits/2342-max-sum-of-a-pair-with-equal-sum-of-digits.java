class Solution {
    public int getSum(int num)
    {
        int ans = 0;
        while(num > 0)
        {
            int lastDigit = num % 10;
            num /= 10;
            ans += lastDigit;
        }
        return ans;
    }

    public int maximumSum(int[] nums) 
    {
        int max = -1;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num : nums)
        {
            int digitSum = getSum(num);
            if(map.containsKey(digitSum))
            {
                max = Math.max(max, num + map.get(digitSum));
                map.put(digitSum,Math.max(map.get(digitSum),num));
            }
            else
                map.put(digitSum,num);
        }
        return max;
    }
}