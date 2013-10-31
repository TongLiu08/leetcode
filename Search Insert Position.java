public class Solution {
    public int searchInsert(int[] A, int target) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        for (int i = 0; i < A.length; i++) {
            if (target <= A[i])
                return i;
        }
        
        return A.length;
    }
}