// Last updated: 7/14/2026, 9:28:55 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4
5        for (int i = 0; i < n; i++) {
6            for (int j = i + 1; j < n; j++) {
7                int temp = matrix[i][j];
8                matrix[i][j] = matrix[j][i];
9                matrix[j][i] = temp;
10            }
11        }
12
13        for (int i = 0; i < n; i++) {
14            int l = 0, r = n - 1;
15            while (l < r) {
16                int temp = matrix[i][l];
17                matrix[i][l] = matrix[i][r];
18                matrix[i][r] = temp;
19                l++;
20                r--;
21            }
22        }
23    }
24}