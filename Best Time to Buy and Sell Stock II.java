public class Solution {
    public int maxProfit(int[] prices) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int size = prices.length, result = 0;
        for (int i = 0; i < size - 1; i++) {
            if (prices[i] < prices[i + 1])
                result += prices[i + 1] - prices[i];
        }
        
        return result;
    }
}