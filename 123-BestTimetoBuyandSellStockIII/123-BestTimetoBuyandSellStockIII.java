// Last updated: 7/14/2026, 9:41:36 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int b1 = Integer.MIN_VALUE, s1 = 0;
4        int b2 = Integer.MIN_VALUE, s2 = 0;
5
6        for (int price : prices) {
7            b1 = Math.max(b1, - price);
8            s1 = Math.max(s1, b1 + price);
9            b2 = Math.max(b2, s1 - price);
10            s2 = Math.max(s2, b2 + price);
11        }
12        return s2;
13    }
14}