// Last updated: 7/31/2026, 10:12:13 AM
1import java.util.*;
2
3class Solution {
4    private Map<String, List<String>> parents = new HashMap<>();
5    private List<List<String>> ans = new ArrayList<>();
6
7    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
8        Set<String> dict = new HashSet<>(wordList);
9        if (!dict.contains(endWord)) {
10            return ans;
11        }
12
13        Map<String, Integer> dist = new HashMap<>();
14        Queue<String> queue = new LinkedList<>();
15
16        queue.offer(beginWord);
17        dist.put(beginWord, 0);
18
19        boolean found = false;
20        int wordLen = beginWord.length();
21
22        while (!queue.isEmpty() && !found) {
23            int levelSize = queue.size();
24            for (int i = 0; i < levelSize; i++) {
25                String curr = queue.poll();
26                int currentDist = dist.get(curr);
27                char[] charArray = curr.toCharArray();
28
29                for (int j = 0; j < wordLen; j++) {
30                    char originalChar = charArray[j];
31
32                    for (char c = 'a'; c <= 'z'; c++) {
33                        if (c == originalChar) continue;
34                        charArray[j] = c;
35                        String nextWord = new String(charArray);
36
37                        if (dict.contains(nextWord)) {
38                            if (!dist.containsKey(nextWord)) {
39                                dist.put(nextWord, currentDist + 1);
40                                parents.computeIfAbsent(nextWord, k -> new ArrayList<>()).add(curr);
41                                queue.offer(nextWord);
42                                if (nextWord.equals(endWord)) {
43                                    found = true;
44                                }
45                            } else if (dist.get(nextWord) == currentDist + 1) {
46                                parents.get(nextWord).add(curr);
47                            }
48                        }
49                    }
50                    charArray[j] = originalChar;
51                }
52            }
53        }
54
55        if (dist.containsKey(endWord)) {
56            List<String> path = new ArrayList<>();
57            path.add(endWord);
58            backtrack(endWord, beginWord, path);
59        }
60
61        return ans;
62    }
63
64    private void backtrack(String word, String beginWord, List<String> path) {
65        if (word.equals(beginWord)) {
66            List<String> fullPath = new ArrayList<>(path);
67            Collections.reverse(fullPath);
68            ans.add(fullPath);
69            return;
70        }
71
72        if (parents.containsKey(word)) {
73            for (String parent : parents.get(word)) {
74                path.add(parent);
75                backtrack(parent, beginWord, path);
76                path.remove(path.size() - 1);
77            }
78        }
79    }
80}