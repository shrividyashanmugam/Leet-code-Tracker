// Last updated: 7/14/2026, 9:39:09 PM
1class Solution {
2    private static final int MOD = 1_000_000_007;
3    private int n;
4    private int[][][] dp;
5
6    private int solve(int idx, int g1, int g2, int[] nums) {
7        if (idx == n) {
8            return (g1 != 0 && g1 == g2) ? 1 : 0;
9        }
10
11        if (dp[idx][g1][g2] != -1)
12            return dp[idx][g1][g2];
13
14        long ans = 0;
15
16        // Ignore current element
17        ans = solve(idx + 1, g1, g2, nums);
18
19        // Put in seq1
20        int ng1 = (g1 == 0) ? nums[idx] : gcd(g1, nums[idx]);
21        ans = (ans + solve(idx + 1, ng1, g2, nums)) % MOD;
22
23        // Put in seq2
24        int ng2 = (g2 == 0) ? nums[idx] : gcd(g2, nums[idx]);
25        ans = (ans + solve(idx + 1, g1, ng2, nums)) % MOD;
26
27        return dp[idx][g1][g2] = (int) ans;
28    }
29
30    public int subsequencePairCount(int[] nums) {
31        n = nums.length;
32        dp = new int[n + 1][201][201];
33
34        for (int i = 0; i <= n; i++) {
35            for (int j = 0; j <= 200; j++) {
36                Arrays.fill(dp[i][j], -1);
37            }
38        }
39
40        return solve(0, 0, 0, nums);
41    }
42
43    private int gcd(int a, int b) {
44        while (b != 0) {
45            int t = a % b;
46            a = b;
47            b = t;
48        }
49        return a;
50    }
51}