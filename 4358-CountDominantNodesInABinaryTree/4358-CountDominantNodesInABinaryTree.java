// Last updated: 7/28/2026, 9:22:07 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    public int countDominantNodes(TreeNode root) {
        solve(root);
        return count;

    }
        int solve(TreeNode root){
            if(root == null)return Integer.MIN_VALUE;
        int max = Math.max(root.val,Math.max(solve(root.left),solve(root.right)));
        if(root.val == max) count++;
            return max;
        }
}