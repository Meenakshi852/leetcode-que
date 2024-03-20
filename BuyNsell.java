// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 5

// link :https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BuyNsell {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int profit = 0;
        for (int i = 0; i < n; i++) {
            int cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
