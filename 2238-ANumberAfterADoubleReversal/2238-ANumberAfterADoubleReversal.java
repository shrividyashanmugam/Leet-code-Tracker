// Last updated: 7/15/2026, 2:05:55 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0)
        {
            return true;
        }
        return num % 10 !=0; 
    }
}