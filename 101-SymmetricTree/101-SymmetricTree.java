// Last updated: 7/14/2026, 9:17:12 PM
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
16
17class Solution {
18    public boolean isSymmetric(TreeNode root) {
19        if (root == null) {
20            return true;
21        }
22        return isMirror(root.left, root.right);
23    }
24    
25    private boolean isMirror(TreeNode node1, TreeNode node2) {
26        if (node1 == null && node2 == null) {
27            return true;
28        }
29        if (node1 == null || node2 == null) {
30            return false;
31        }
32        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
33    }
34}