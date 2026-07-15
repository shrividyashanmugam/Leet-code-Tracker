// Last updated: 7/15/2026, 2:09:03 PM
class Solution {
   public boolean isPalindrome(String s) {
        
        char[] Chars = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(Chars[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(Chars[right])) {
                right--;
            } else {
                if (Character.toLowerCase(Chars[left]) != Character.toLowerCase(Chars[right])) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}