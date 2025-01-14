class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();
        int[] C = new int[A.length];
        for(int i = 0; i < A.length; i++)
        {
            int count = 0;
            setA.add(A[i]);
            setB.add(B[i]);

            for(int x : setA)
            {
                if(setB.contains(x))
                    count++;
            }

            C[i] = count;
        }
        return C;
    }
}