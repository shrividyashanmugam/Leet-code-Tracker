// Last updated: 7/31/2026, 9:04:28 AM
1import java.util.Arrays;
2
3class Solution {
4    public int minimumPushes(String word) {
5        int[] freq = new int[26];
6        for (char c : word.toCharArray()) {
7            freq[c - 'a']++;
8        }
9        Arrays.sort(freq);
10        
11        int pushes = 0;
12        int count = 0; 
13        for (int i = 25; i >= 0; i--) {
14            if (freq[i] == 0) break;
15            
16            int multiplier = (count / 8) + 1;
17            pushes += freq[i] * multiplier;
18            count++;
19        }
20        
21        return pushes;
22    }
23}