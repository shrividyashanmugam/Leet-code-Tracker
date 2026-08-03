// Last updated: 8/3/2026, 9:43:06 PM
1class Solution {
2    public String stoneGameIII(int[] stoneValue) {
3        int n = stoneValue.length;
4        int[] dp = new int[n + 1];
5
6        // Process backwards from the last pile
7        for (int i = n - 1; i >= 0; i--) {
8            dp[i] = Integer.MIN_VALUE;
9            int take = 0;
10            
11            // Try picking 1, 2, or 3 stones
12            for (int k = 0; k < 3 && i + k < n; k++) {
13                take += stoneValue[i + k];
14                dp[i] = Math.max(dp[i], take - dp[i + k + 1]);
15            }
16        }
17
18        if (dp[0] > 0) return "Alice";
19        if (dp[0] < 0) return "Bob";
20        return "Tie";
21    }
22}