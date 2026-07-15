// Last updated: 7/15/2026, 2:05:50 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)
        {
            return 0;
        }
        if(n%2==0)
        {
            return n/2;
        }
        return n;
    }
}