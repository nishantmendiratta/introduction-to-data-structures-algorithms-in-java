package org.takeuforward.arrays1;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
    static class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = Integer.MIN_VALUE;
            int minValue = prices[0];
            if (prices.length == 1) {
                return 0;
            }
            for (int i=1; i<prices.length; i++) {
                minValue = Math.min(minValue, prices[i]);
                maxProfit = Math.max(prices[i]-minValue, maxProfit);
            }
            return maxProfit;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] prices = {7,1,5,3,6,4}; // 5 profit = 6-1 = 5.
        int maxProfit = sl.maxProfit(prices);
        System.out.println("MAX PROFIT: " + maxProfit);

    }
}

