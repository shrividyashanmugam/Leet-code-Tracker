// Last updated: 7/31/2026, 9:14:45 AM
1class Solution {
2    public TreeNode sortedArrayToBST(int[] nums) {
3        return buildBST(nums, 0, nums.length - 1);
4    }
5    
6    private TreeNode buildBST(int[] nums, int left, int right) {
7        // Base case: no elements to process
8        if (left > right) {
9            return null;
10        }
11        
12        // Pick the middle element to keep the tree height-balanced
13        int mid = left + (right - left) / 2;
14        TreeNode root = new TreeNode(nums[mid]);
15        
16        // Recursively build left and right subtrees
17        root.left = buildBST(nums, left, mid - 1);
18        root.right = buildBST(nums, mid + 1, right);
19        
20        return root;
21    }
22}