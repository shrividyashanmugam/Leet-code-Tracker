// Last updated: 7/15/2026, 2:06:24 PM
class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private Integer prev = null;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }

        prev = node.val;

        inorder(node.right);
    }
}