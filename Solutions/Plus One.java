public class Solution {
    public int[] plusOne(int[] digits) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int carry = 1;
        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] == 10) {
                carry = 1;
                digits[i] = 0;
            }
            else {
                carry = 0;
                break;
            }
        }
        
        if (carry == 1) {
            int[] newDigits = new int[size + 1];
            newDigits[0] = 1;
            for (int i = 1; i < size + 1; i++) {
                newDigits[i] = digits[i - 1];
            }
            
            return newDigits;
        }
        
        return digits;
    }
}