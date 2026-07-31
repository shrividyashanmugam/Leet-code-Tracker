// Last updated: 7/31/2026, 10:14:21 AM
1import java.util.Arrays;
2
3class Solution {
4    public int candy(int[] ratings) {
5        int n = ratings.length;
6        int[] candies = new int[n];
7        
8        // Step 1: Every child gets at least 1 candy initially
9        Arrays.fill(candies, 1);
10        
11        // Step 2: Left-to-Right pass
12        for (int i = 1; i < n; i++) {
13            if (ratings[i] > ratings[i - 1]) {
14                candies[i] = candies[i - 1] + 1;
15            }
16        }
17        
18        // Step 3: Right-to-Left pass and calculate total
19        int totalCandies = candies[n - 1];
20        for (int i = n - 2; i >= 0; i--) {
21            if (ratings[i] > ratings[i + 1]) {
22                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
23            }
24            totalCandies += candies[i];
25        }
26        
27        return totalCandies;
28    }
29}