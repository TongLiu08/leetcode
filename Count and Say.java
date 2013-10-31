public class Solution {
    public String countAndSay(int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (n == 1)
            return "1";
            
        StringBuffer result = new StringBuffer("1");
        StringBuffer tempBuffer = new StringBuffer();
        while (n > 1) {
            int prevIndex = 0;
            
            for (int i = 1; i < result.length(); i++) {
                if (result.charAt(i) != result.charAt(prevIndex)) {
                    tempBuffer.append(i - prevIndex + "");
                    tempBuffer.append(result.charAt(prevIndex));

                    prevIndex = i;
                }
            }
            tempBuffer.append(result.length() - prevIndex + "");
        	tempBuffer.append(result.charAt(prevIndex));
        	
            n--;
            result = tempBuffer;
            tempBuffer = new StringBuffer();
        }
        
        return result.toString();
    }
}