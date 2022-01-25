class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int j = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < prices[j]){
                j = i;
                continue;
            }
            int curr_profit = prices[i] - prices[j];
            max_profit += curr_profit;
            j = i;
        }
        return max_profit;
    }
}