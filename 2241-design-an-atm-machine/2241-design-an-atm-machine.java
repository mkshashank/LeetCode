class ATM {
    int twentys = 0, fiftys = 0, hundreds = 0, twoHundreds = 0, fiveHundreds = 0;

    public ATM() {}

    public void deposit(int[] banknotesCount) {
        twentys += banknotesCount[0];
        fiftys += banknotesCount[1];
        hundreds += banknotesCount[2];
        twoHundreds += banknotesCount[3];
        fiveHundreds += banknotesCount[4];
    }

    public int[] withdraw(int amount) {
        int[] ans = new int[5];
        int t = twentys, f = fiftys, h = hundreds, th = twoHundreds, fh = fiveHundreds;

        // $500 notes
        ans[4] = Math.min(amount / 500, fh);
        amount -= ans[4] * 500;
        fh -= ans[4];

        // $200 notes
        ans[3] = Math.min(amount / 200, th);
        amount -= ans[3] * 200;
        th -= ans[3];

        // $100 notes
        ans[2] = Math.min(amount / 100, h);
        amount -= ans[2] * 100;
        h -= ans[2];

        // $50 notes
        ans[1] = Math.min(amount / 50, f);
        amount -= ans[1] * 50;
        f -= ans[1];

        // $20 notes
        ans[0] = Math.min(amount / 20, t);
        amount -= ans[0] * 20;
        t -= ans[0];

        if (amount == 0) {
            twentys = t; fiftys = f; hundreds = h; twoHundreds = th; fiveHundreds = fh;
            return ans;
        }
        return new int[]{-1};
    }
}