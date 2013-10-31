public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int index = m + n - 1;
        int indexA = m - 1;
        int indexB = n - 1;
        while (indexA >= 0 && indexB >= 0) {
            if (A[indexA] >= B[indexB]) 
                A[index--] = A[indexA--];
            else 
                A[index--] = B[indexB--];
        }
        
        while (indexB >= 0) {
            A[index--] = B[indexB--];
        }
    }
}