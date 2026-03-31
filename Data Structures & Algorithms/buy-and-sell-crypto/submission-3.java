class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int i=1;
        int n=prices.length;
        while(i<n){
            profit=Math.max(prices[i]-min,profit);
            min=Math.min(min,prices[i]);
            i++;
        }
        return profit;
    }
}
