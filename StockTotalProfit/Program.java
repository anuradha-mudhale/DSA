package com.java;

class Program {
    public int maximumProfit(int prices[]) {
        int res = 0;
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Program obj = new Program();
        int[] prices = {100, 180, 260, 310, 40, 535, 695};

        int profit = obj.maximumProfit(prices);
        System.out.println("Maximum Profit = " + profit);
    }
}
