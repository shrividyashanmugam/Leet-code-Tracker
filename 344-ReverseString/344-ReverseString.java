// Last updated: 7/15/2026, 2:07:23 PM
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start < end){
            s[start] = (char) ((s[start]+s[end]) - (s[end--]=s[start++]));
            
        }
        
    }
}