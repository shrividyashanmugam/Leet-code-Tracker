// Last updated: 7/14/2026, 9:29:49 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int goal = nums.length - 1;
4        for(int i = nums.length - 1; i>= 0; i--){
5            if( i + nums[i] >= goal ){
6                goal = i;
7            }
8        }
9        return goal == 0;
10    }
11}