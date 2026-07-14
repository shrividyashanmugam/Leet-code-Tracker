// Last updated: 7/14/2026, 9:21:04 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int top = 0, bottom = matrix.length - 1;
4        int left = 0, right = matrix[0].length - 1;
5        List<Integer> spiral = new ArrayList<>();
6
7        while (top <= bottom && left <= right) {
8            for (int i = left; i <= right; i++)
9                spiral.add(matrix[top][i]);
10            top++;
11
12            for (int j = top; j <= bottom; j++)
13                spiral.add(matrix[j][right]);
14            right--;
15
16            if (top <= bottom) {
17                for (int k = right; k >= left; k--)
18                    spiral.add(matrix[bottom][k]);
19                bottom--;
20            }
21
22            if (left <= right) {
23                for (int l = bottom; l >= top; l--)
24                    spiral.add(matrix[l][left]);
25                left++;
26            }
27        }
28
29        return spiral;
30    }
31}