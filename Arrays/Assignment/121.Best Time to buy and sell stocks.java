class Solution {
    public int maxProfit(int[] prices) {
       int bp = prices[0];
       int profit = 0;
       for(int i=1;i<prices.length;i++){
           bp=Math.min(bp,prices[i]);
           int pist = prices[i]-bp;
           profit=Math.max(pist,profit);
        }
        return profit;
    }
}
