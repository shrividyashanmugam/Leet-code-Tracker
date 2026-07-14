// Last updated: 7/14/2026, 9:36:58 PM
1import java.math.*;
2class Solution {
3    public int divide(int dividend, int divisor) {
4        
5        int quo = dividend / divisor;
6        if(dividend==Integer.MIN_VALUE && divisor==-1){
7            return Integer.MAX_VALUE;
8        }
9        return quo;
10    }
11}