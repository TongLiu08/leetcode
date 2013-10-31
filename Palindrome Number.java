public class Solution {
    public boolean isPalindrome(int x) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (x < 0)
            return false;

        int base = 10;
        while (x / base >= 10) {
            base *= 10;
        }
        while (x >= 10) {
            if ((x / base) != (x % 10))
                return false;
            x = x % base / 10;
            base /= 100;
        }
        
        return true;
    }
}