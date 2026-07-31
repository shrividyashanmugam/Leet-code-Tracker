// Last updated: 7/31/2026, 9:20:37 AM
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<Integer> postorderTraversal(TreeNode root) {
6        List<Integer> result = new ArrayList<>();
7        traverse(root, result);
8        return result;
9    }
10    
11    private void traverse(TreeNode node, List<Integer> result) {
12        if (node == null) return;
13        
14        traverse(node.left, result);  // 1. Visit Left
15        traverse(node.right, result); // 2. Visit Right
16        result.add(node.val);         // 3. Visit Root
17    }
18}