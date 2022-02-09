class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int i = 0, j = 0;
        for(i = 0; i < prices.length; i++){
            if(prices[i] < prices[j]){
                j = i;
            } else {
                int diff = prices[i] - prices[j];
                maxP = Math.max(diff, maxP);
            }
        }
        return maxP;
    }
}