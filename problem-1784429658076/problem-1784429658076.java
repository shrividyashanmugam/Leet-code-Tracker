// Last updated: 7/19/2026, 8:24:18 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int count = 0;
18    public int countDominantNodes(TreeNode root) {
19        solve(root);
20        return count;
21
22    }
23        int solve(TreeNode root){
24            if(root == null)return Integer.MIN_VALUE;
25        int max = Math.max(root.val,Math.max(solve(root.left),solve(root.right)));
26        if(root.val == max) count++;
27            return max;
28        }
29}