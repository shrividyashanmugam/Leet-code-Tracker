// Last updated: 7/31/2026, 9:22:14 AM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder sb = new StringBuilder();
4        
5        while (columnNumber > 0) {
6            columnNumber--; // Adjust for 1-based indexing
7            
8            char c = (char) ('A' + (columnNumber % 26));
9            sb.append(c);
10            
11            columnNumber /= 26;
12        }
13        
14        return sb.reverse().toString();
15    }
16}