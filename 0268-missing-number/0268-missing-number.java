class Solution {
    public int missingNumber(int[] nums) {
        int XOR1 = 0, XOR2 = 0;
        for(int i = 0; i < nums.length; i++)
        {
            XOR1 ^= nums[i];
            XOR2 ^= i + 1;
        }
        return XOR1 ^ XOR2;
    }
}