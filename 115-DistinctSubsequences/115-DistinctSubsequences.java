// Last updated: 7/14/2026, 9:44:45 PM
1class Solution {
2    public int numDistinct(String B, String A) {
3         int lenA= A.length();
4        int lenB = B.length();
5        Integer [][] memo = new Integer [lenA][lenB];
6
7        return solve(A,B,lenA-1,lenB-1,memo);
8
9    }
10
11    private int solve(String A, String B, int i, int j, Integer[][]memo){
12
13        if(i<0) return 1;
14
15        if(j<0) return 0;
16
17        if(j<i) return 0;
18
19        if(memo [i][j] != null) return memo [i][j];
20
21        if(A.charAt(i) == B.charAt(j)){
22            return memo [i][j] = solve(A,B,i-1,j-1,memo) + solve(A,B,i,j-1,memo);
23        }
24        return memo[i][j] = solve(A,B,i,j-1,memo);
25    }
26}