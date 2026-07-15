// Last updated: 7/15/2026, 2:08:59 PM
class Solution {
    public static boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, wordDict, 0, new Boolean[s.length()]);
    }

    public static boolean wordBreak(String s, List<String> wordDict, int offset, Boolean[] buffer) {
        if(offset == s.length()) {
            return true;
        }
        if(buffer[offset] != null) {
            return buffer[offset];
        }
        for(var word: wordDict) {
            if(s.startsWith(word, offset)){
                if(wordBreak(s, wordDict, offset + word.length(), buffer)){
                    return buffer[offset] = true;
                }
            }
        }

        return buffer[offset] = false;
    }
}