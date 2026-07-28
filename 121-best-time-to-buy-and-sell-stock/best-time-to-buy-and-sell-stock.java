class Solution {
    public int maxProfit(int[] prices) {
        // int profit = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = 1; j < prices.length; j++) {
        //         if ((prices[j]-prices[i])>profit && j>i) {
        //             profit=(prices[j]-prices[i]);
        //         }
        //     }
        // }
        //return profit;

        int minBuy = prices[0];
        int maxProfit = 0;

        for(int i = 0; i <  prices.length; i++){
            if(prices[i] < minBuy){
                minBuy = prices[i];
            } else {
                maxProfit = Math.max(maxProfit,prices[i] - minBuy);
            }
        }
        return maxProfit;

    }
}