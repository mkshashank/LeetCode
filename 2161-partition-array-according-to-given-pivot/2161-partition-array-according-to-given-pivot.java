class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessThanPivot = new ArrayList<Integer>();
        List<Integer> equalToPivot = new ArrayList<Integer>();
        List<Integer> greaterThanPivot = new ArrayList<Integer>();
        for(int x : nums)
            if(x < pivot)
                lessThanPivot.add(x);
        for(int x : nums)
            if(x == pivot)
                equalToPivot.add(x);
        for(int x : nums)
            if(x > pivot)
                greaterThanPivot.add(x);

        int[] ans = new int[nums.length];
        int ind = 0;
        for(int x : lessThanPivot)
            ans[ind++] = x;
        for(int x : equalToPivot)
            ans[ind++] = x;
        for(int x : greaterThanPivot)
            ans[ind++] = x;
        return ans;
    }
}