// Last updated: 7/15/2026, 2:10:09 PM
import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int m = words.length;

        if (n == 0 || m == 0) return ans;

        int len = words[0].length();
        int windowSize = m * len;

        if (n < windowSize) return ans;

        Map<String, Integer> target = new HashMap<>();
        for (String word : words) {
            target.put(word, target.getOrDefault(word, 0) + 1);
        }

        for (int offset = 0; offset < len; offset++) {

            int left = offset;
            int count = 0;
            Map<String, Integer> current = new HashMap<>();

            for (int right = offset; right + len <= n; right += len) {

                String word = s.substring(right, right + len);

                if (!target.containsKey(word)) {
                    current.clear();
                    count = 0;
                    left = right + len;
                    continue;
                }

                current.put(word, current.getOrDefault(word, 0) + 1);
                count++;

                while (current.get(word) > target.get(word)) {
                    String leftWord = s.substring(left, left + len);
                    current.put(leftWord, current.get(leftWord) - 1);
                    left += len;
                    count--;
                }

                if (count == m) {
                    ans.add(left);

                    String leftWord = s.substring(left, left + len);
                    current.put(leftWord, current.get(leftWord) - 1);
                    left += len;
                    count--;
                }
            }
        }

        return ans;
    }
}