// Last updated: 7/31/2026, 9:13:48 AM
1class Solution {
2    public boolean hasPathSum(TreeNode root, int targetSum) {
3        if (root == null) {
4            return false;
5        }
6     
7        if (root.left == null && root.right == null) {
8            return targetSum == root.val;
9        }
10        
11
12        int newTarget = targetSum - root.val;
13        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
14    }
15}