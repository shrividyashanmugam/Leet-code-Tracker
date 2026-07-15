// Last updated: 7/15/2026, 2:10:32 PM
class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int total = 0;
        
        for (int i = 0; i < chars.length; i++) {
            int currentVal = getValue(chars[i]);
            
            
            if (i + 1 < chars.length && getValue(chars[i + 1]) > currentVal) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        
        return total;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
