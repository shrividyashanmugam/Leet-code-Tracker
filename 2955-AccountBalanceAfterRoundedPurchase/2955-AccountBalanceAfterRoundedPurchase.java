// Last updated: 7/15/2026, 2:05:43 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedamount = (((purchaseAmount+5)/10)* 10);
        return 100 - roundedamount;
    }
}