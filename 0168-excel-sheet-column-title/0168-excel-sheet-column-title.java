class Solution {
    public String convertToTitle(int columnNumber) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0)
        {
            columnNumber--;
            char c = (char)((columnNumber % 26) + 'A');
            sb.append(c);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}