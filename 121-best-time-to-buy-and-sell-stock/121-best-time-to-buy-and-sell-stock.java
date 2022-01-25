class Solution {
    public int maxProfit(int[] prices) {
        int j = 0;
        int max_profit = 0;
        for(int i =0; i < prices.length; i++){
            if(prices[i] < prices[j]){
                j = i;
                continue;
            }
            int curr = prices[i] - prices[j];
            max_profit = Math.max(curr, max_profit);
        }
        return max_profit;
    }
}