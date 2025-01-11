class Solution {
    public int missingNumber(int[] nums) {
        int XOR1 = 0, XOR2 = 0;
        for(int i = 0; i <= nums.length; i++)
            XOR1 ^= i;
        for(int x : nums)
            XOR2 ^= x;
        return XOR1 ^ XOR2;
    }
}