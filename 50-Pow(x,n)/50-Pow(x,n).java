// Last updated: 7/14/2026, 9:27:30 PM
1class Solution {
2    public double calpow(double x, long n) {
3        if (n == 0) return 1;
4        if (n == 1) return x;
5
6        double half = calpow(x, n / 2);
7
8        if (n % 2 == 1) {
9            return half * half*x;
10        } else {
11            return half * half;
12        }
13    }
14
15    public double myPow(double x, int n) {
16        long N = n;  // promote to long
17        if (N >= 0) {
18            return calpow(x, N);
19        } else {
20            return 1.0 / calpow(x, -N);
21        }
22    }
23}