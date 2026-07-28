// Last updated: 7/28/2026, 9:21:00 PM
1import java.util.Arrays;
2
3class Solution {
4    public String smallestPalindrome(String s) {
5        int n = s.length();
6        int halfLen = n / 2;
7        char[] half = s.substring(0, halfLen).toCharArray();
8        Arrays.sort(half);
9        
10        StringBuilder sb = new StringBuilder();
11        sb.append(half);
12 
13        if (n % 2 != 0) {
14            sb.append(s.charAt(halfLen));
15        }
16        for (int i = halfLen - 1; i >= 0; i--) {
17            sb.append(half[i]);
18        }
19        
20        return sb.toString();
21    }
22}