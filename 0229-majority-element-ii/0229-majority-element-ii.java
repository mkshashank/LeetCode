class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int count1 = 0, count2 = 0, ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE, min = nums.length/3;
        for(int i = 0; i < nums.length; i++)
        {
            if(count1 == 0 && nums[i] != ele2)
            {
                count1 = 1;
                ele1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != ele1)
            {
                count2 = 1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i])
                count1++;
            else if(ele2 == nums[i])
                count2++;
            else
            {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0; 

        for(int x : nums)
        {
            if(x == ele1)
                count1++;
            if(x == ele2)
                count2++;
        }

        if(count1 > min)
            ans.add(ele1);
        if(count2 > min)
            ans.add(ele2);

        return ans;
    }
}