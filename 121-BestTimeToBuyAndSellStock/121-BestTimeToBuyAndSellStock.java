// Last updated: 7/15/2026, 2:09:08 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int finalProfit = 0;
        for(int i = 0;i < prices.length;i++){
            if(prices[i]<minValue){
                minValue = prices[i];
            }else if(prices[i]-minValue > finalProfit){
                finalProfit = prices[i]-minValue;
            }
        }
        return finalProfit;
    }
}