public class Solution {
    public int removeDuplicates(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int length = A.length;
        if (length == 0)
            return 0;
        int prev = A[0], len = 1;
        for (int i = 1; i < length; i++) {
            if (A[i] != prev) {
                A[len++] = A[i];
                prev = A[i];
            }
        }
        
        return len;
    }
}