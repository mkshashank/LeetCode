class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int ans = 0, temp = x;
        while(temp > 0)
        {
            int lastDigit = temp % 10;
            ans = ans*10 + lastDigit;
            temp /= 10;
        }
        return ans == x;
    }
}