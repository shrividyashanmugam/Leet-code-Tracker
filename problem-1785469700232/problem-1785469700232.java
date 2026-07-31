// Last updated: 7/31/2026, 9:18:20 AM
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<Integer> getRow(int rowIndex) {
6        List<Integer> row = new ArrayList<>();
7        
8        for (int i = 0; i <= rowIndex; i++) {
9            row.add(1); // Add an element for the new row size
10            
11            // Update values from right to left
12            for (int j = i - 1; j > 0; j--) {
13                row.set(j, row.get(j) + row.get(j - 1));
14            }
15        }
16        
17        return row;
18    }
19}