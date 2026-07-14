// Last updated: 7/14/2026, 9:22:20 PM
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<String> generateParenthesis(int n) {
6        List<String> result = new ArrayList<>();
7        backtrack(result, "", 0, 0, n);
8        return result;
9    }
10    
11    private void backtrack(List<String> result, String current, int openCount, int closeCount, int n) {
12        if (openCount == n && closeCount == n) {
13            result.add(current);
14            return;
15        }
16        
17        if (openCount < n) {
18            backtrack(result, current + "(", openCount + 1, closeCount, n);
19        }
20        if (closeCount < openCount) {
21            backtrack(result, current + ")", openCount, closeCount + 1, n);
22        }
23    }
24}