// Last updated: 7/29/2026, 8:52:06 PM
1import java.util.Arrays;
2
3class Solution {
4    private static final int MAX_K = 1_000_001; // Capped at k_max + 1
5
6    public String smallestPalindrome(String s, int k) {
7        int[] count = new int[26];
8        for (char c : s.toCharArray()) {
9            count[c - 'a']++;
10        }
11
12        int[] halfCount = new int[26];
13        char midLetter = '\0';
14        int halfLen = 0;
15
16        for (int i = 0; i < 26; i++) {
17            halfCount[i] = count[i] / 2;
18            halfLen += halfCount[i];
19            if (count[i] % 2 == 1) {
20                midLetter = (char) ('a' + i);
21            }
22        }
23
24        // Check if there are at least k distinct palindromic permutations
25        if (countArrangements(halfCount) < k) {
26            return "";
27        }
28
29        StringBuilder leftHalf = new StringBuilder();
30
31        // Construct the left half character by character
32        for (int pos = 0; pos < halfLen; pos++) {
33            for (int i = 0; i < 26; i++) {
34                if (halfCount[i] == 0) continue;
35
36                // Try picking character 'a' + i
37                halfCount[i]--;
38                int arrangements = countArrangements(halfCount);
39
40                if (arrangements >= k) {
41                    leftHalf.append((char) ('a' + i));
42                    break; // Lock in this character
43                } else {
44                    k -= arrangements;
45                    halfCount[i]++; // Backtrack and try next character
46                }
47            }
48        }
49
50        String left = leftHalf.toString();
51        StringBuilder result = new StringBuilder(left);
52        if (midLetter != '\0') {
53            result.append(midLetter);
54        }
55        result.append(new StringBuilder(left).reverse());
56
57        return result.toString();
58    }
59
60    // Calculates total permutations of remaining character counts (multinomial coefficient)
61    private int countArrangements(int[] count) {
62        int total = 0;
63        for (int c : count) {
64            total += c;
65        }
66
67        long res = 1;
68        for (int freq : count) {
69            if (freq == 0) continue;
70            res *= nCk(total, freq);
71            if (res >= MAX_K) return MAX_K;
72            total -= freq;
73        }
74
75        return (int) Math.min(res, MAX_K);
76    }
77
78    // Calculates combinations n Choose k capped at MAX_K
79    private long nCk(int n, int k) {
80        if (k < 0 || k > n) return 0;
81        k = Math.min(k, n - k);
82
83        long res = 1;
84        for (int i = 1; i <= k; i++) {
85            res = res * (n - i + 1) / i;
86            if (res >= MAX_K) return MAX_K;
87        }
88        return res;
89    }
90}