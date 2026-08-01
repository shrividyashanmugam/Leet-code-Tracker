// Last updated: 8/1/2026, 7:13:09 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int n = nums.length;
4        // dp[i][j] stores the maximum net score difference (current player's score - opponent's score)
5        // for the subarray nums[i...j].
6        int[][] dp = new int[n][n];
7
8        // Base case: Subarray of length 1
9        for (int i = 0; i < n; i++) {
10            dp[i][i] = nums[i];
11        }
12
13        // Fill the DP table for subarray lengths from 2 to n
14        for (int len = 2; len <= n; len++) {
15            for (int i = 0; i <= n - len; i++) {
16                int j = i + len - 1;
17                // If player takes nums[i], opponent gets dp[i+1][j], net score difference = nums[i] - dp[i+1][j]
18                // If player takes nums[j], opponent gets dp[i][j-1], net score difference = nums[j] - dp[i][j-1]
19                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
20            }
21        }
22
23        // If net score difference for the entire array >= 0, Player 1 wins or ties.
24        return dp[0][n - 1] >= 0;
25    }
26}