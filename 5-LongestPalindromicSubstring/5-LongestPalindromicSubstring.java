// Last updated: 7/31/2026, 9:31:18 AM
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() < 1) return "";
4        
5        int start = 0, end = 0;
6        
7        for (int i = 0; i < s.length(); i++) {
8            // Check for odd-length palindromes (center at i)
9            int len1 = expandAroundCenter(s, i, i);
10            // Check for even-length palindromes (center between i and i+1)
11            int len2 = expandAroundCenter(s, i, i + 1);
12            
13            int maxLen = Math.max(len1, len2);
14            
15            // If we found a longer palindrome, update start and end indices
16            if (maxLen > end - start) {
17                start = i - (maxLen - 1) / 2;
18                end = i + maxLen / 2;
19            }
20        }
21        
22        return s.substring(start, end + 1);
23    }
24    
25    private int expandAroundCenter(String s, int left, int right) {
26        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
27            left--;
28            right++;
29        }
30        // Return length of palindrome found
31        return right - left - 1;
32    }
33}