/*day45 121. Best Time to Buy and Sell Stock
        Say you have an array for which the ith element is the price of a given stock on day i.
        If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
        Note that you cannot sell a stock before you buy one.
        Example 1:
        Input: [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Not 7-1 = 6, as selling price needs to be larger than buying price.*/


public class BestTimeBuySellStock {

    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};
        int result;
        result = Solution.maxProfit(nums);
        System.out.println(result);
    }

    static class Solution {
        public static int maxProfit(int[] prices) {
            int maxCur = 0, maxSoFar = 0;
            for (int i = 1; i < prices.length; i++) {
                maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
                maxSoFar = Math.max(maxCur, maxSoFar);
            }
            return maxSoFar;
        }
    }
}
