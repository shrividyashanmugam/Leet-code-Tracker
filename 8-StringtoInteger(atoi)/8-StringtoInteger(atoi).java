// Last updated: 7/31/2026, 9:32:16 AM
1class Solution {
2    public int myAtoi(String s) {
3        if (s == null || s.length() == 0) return 0;
4        
5        int n = s.length();
6        int i = 0;
7        
8        // 1. Skip leading whitespaces
9        while (i < n && s.charAt(i) == ' ') {
10            i++;
11        }
12        
13        // Check if string contained only spaces
14        if (i == n) return 0;
15        
16        // 2. Check sign
17        int sign = 1;
18        if (s.charAt(i) == '+') {
19            i++;
20        } else if (s.charAt(i) == '-') {
21            sign = -1;
22            i++;
23        }
24        
25        // 3. Convert digits and handle overflow
26        int result = 0;
27        while (i < n && Character.isDigit(s.charAt(i))) {
28            int digit = s.charAt(i) - '0';
29            
30            // Check for overflow before appending digit
31            if (result > Integer.MAX_VALUE / 10 || 
32               (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
33                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
34            }
35            
36            result = result * 10 + digit;
37            i++;
38        }
39        
40        return result * sign;
41    }
42}