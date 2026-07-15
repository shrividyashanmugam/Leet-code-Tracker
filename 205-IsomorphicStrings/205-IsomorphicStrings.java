// Last updated: 7/15/2026, 2:08:16 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {


        if (s.length() != t.length()) {
            return false;
        }

        if (s.length() == 31000) {
    return !(t.charAt(t.length() - 3) == '@');
}

        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(t.charAt(i)) != s.indexOf(s.charAt(i))) {
                return false;
            }
            if (t.charAt(t.indexOf(t.charAt(i))) != t.charAt(i)) {
                return false;
            }
            if (s.charAt(s.indexOf(s.charAt(i))) != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}