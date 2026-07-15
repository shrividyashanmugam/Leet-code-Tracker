// Last updated: 7/15/2026, 2:08:26 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0)
        {
            n=n&n-1;
            count++;
        }
        return count; 
    }
}