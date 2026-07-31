// Last updated: 7/31/2026, 10:13:21 AM
1import java.util.*;
2
3class Solution {
4    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
5        Set<String> dict = new HashSet<>(wordList);
6        if (!dict.contains(endWord)) {
7            return 0;
8        }
9
10        Queue<String> queue = new LinkedList<>();
11        queue.offer(beginWord);
12        
13        int level = 1;
14        int wordLen = beginWord.length();
15
16        while (!queue.isEmpty()) {
17            int size = queue.size();
18            for (int i = 0; i < size; i++) {
19                String current = queue.poll();
20                char[] chars = current.toCharArray();
21
22                for (int j = 0; j < wordLen; j++) {
23                    char originalChar = chars[j];
24
25                    for (char c = 'a'; c <= 'z'; c++) {
26                        if (c == originalChar) continue;
27                        
28                        chars[j] = c;
29                        String nextWord = new String(chars);
30
31                        if (nextWord.equals(endWord)) {
32                            return level + 1;
33                        }
34
35                        if (dict.contains(nextWord)) {
36                            queue.offer(nextWord);
37                            dict.remove(nextWord); // mark as visited
38                        }
39                    }
40                    chars[j] = originalChar;
41                }
42            }
43            level++;
44        }
45
46        return 0;
47    }
48}