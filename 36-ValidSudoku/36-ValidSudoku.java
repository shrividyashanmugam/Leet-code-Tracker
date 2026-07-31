// Last updated: 7/31/2026, 9:36:36 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] rows = new boolean[9][9];
4        boolean[][] cols = new boolean[9][9];
5        boolean[][] boxes = new boolean[9][9];
6        
7        for (int r = 0; r < 9; r++) {
8            for (int c = 0; c < 9; c++) {
9                if (board[r][c] != '.') {
10                    int num = board[r][c] - '1'; // Map '1'-'9' to 0-8
11                    int boxIdx = (r / 3) * 3 + (c / 3);
12                    
13                    if (rows[r][num] || cols[c][num] || boxes[boxIdx][num]) {
14                        return false;
15                    }
16                    
17                    rows[r][num] = true;
18                    cols[c][num] = true;
19                    boxes[boxIdx][num] = true;
20                }
21            }
22        }
23        
24        return true;
25    }
26}