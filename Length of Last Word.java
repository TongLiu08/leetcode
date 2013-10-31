public class Solution {
    public int lengthOfLastWord(String s) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int wordIndex = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (wordIndex != -1) {
                    return wordIndex - i;
                }
            } else {
                if (wordIndex == -1)
                    wordIndex = i;
            }
        }
        
        if (wordIndex != -1)
            return wordIndex + 1;
            
        return 0;
    }
}