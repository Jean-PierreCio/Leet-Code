package NeetCode;

//import math;
class Solution {
    public int maxProfit(int[] prices) {
        int maxChange = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if (prices[i] - min > maxChange) {
                maxChange = prices[i] - min;
            }

        }
        return maxChange;
    }
}