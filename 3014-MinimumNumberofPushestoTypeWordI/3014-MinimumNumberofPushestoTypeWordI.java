// Last updated: 7/30/2026, 10:14:18 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int sum = 0;
4        int n = word.length();
5        for(int i = 0;i<n;i++){
6            sum += (i/8) + 1;
7        }
8    return sum;
9    }
10}