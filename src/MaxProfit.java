/*LeetCode
day3 #122

Best Time to Buy and Sell Stock II
        Say you have an array for which the ith element is the price of a given stock on day i.
        Design an algorithm to find the maximum profit.
        You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
        However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class MaxProfit {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2};
        int result;
        result = Solution.maxProfit(nums);
        System.out.println(result);
    }

    //my way
    static class Solution {
        static public int maxProfit(int[] prices) {
            int profit;
            int maxProf = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    profit = prices[i] - prices[i - 1];
                    maxProf += profit;
                }
            }
            return maxProf;
        }
    }
}
  /*  other way
  can't buy and sell in one day

  public static int maxProfit(int[] prices) {
        int len = prices.length;
        if(len <= 1)
            return 0;

        int i = 0;
        int total = 0;
        while(i < len - 1){
            int buy,sell;
            //寻找递减区间的最后一个值（局部最小点）
            while(i+1 < len && prices[i+1] < prices[i])
                i++;
            //局部最小点作为买入点
            buy = i;

            //找下一个点(卖出点至少为下一个点）
            i++;
            //不满足。。继续往下找递增区间的最后一个值（局部最高点）
            while(i<len && prices[i] >= prices[i-1])
                i++;
            //设置卖出点
            sell = i-1;
            //计算总和
            total += prices[sell] - prices[buy];
        }
        return total;
    }*/