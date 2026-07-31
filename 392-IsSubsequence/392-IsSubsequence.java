// Last updated: 7/31/2026, 10:18:10 AM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int i = 0, j = 0;
4        int m = s.length(), n = t.length();
5
6        while (i < m && j < n) {
7            if (s.charAt(i) == t.charAt(j)) {
8                i++;
9            }
10            j++;
11        }
12
13        return i == m;
14    }
15}