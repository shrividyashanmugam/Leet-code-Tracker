// Last updated: 7/31/2026, 9:37:34 AM
1class Solution {
2    public String countAndSay(int n) {
3        String s = "1";
4        
5        for (int i = 1; i < n; i++) {
6            s = getNext(s);
7        }
8        
9        return s;
10    }
11    
12    private String getNext(String s) {
13        StringBuilder sb = new StringBuilder();
14        int count = 1;
15        
16        for (int i = 0; i < s.length(); i++) {
17            // If the next character is the same, increment count
18            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
19                count++;
20            } else {
21                // Otherwise, append the count and character, then reset count
22                sb.append(count).append(s.charAt(i));
23                count = 1;
24            }
25        }
26        
27        return sb.toString();
28    }
29}