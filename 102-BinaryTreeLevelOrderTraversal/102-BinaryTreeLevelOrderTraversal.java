// Last updated: 7/14/2026, 9:34:23 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) 
18    {
19        List<List<Integer>>al=new ArrayList<>();
20        pre(root,0,al);
21        return al;
22    }
23    public static void pre(TreeNode root,int l,List<List<Integer>>al)
24    {
25        if(root==null)
26            return;
27        if(al.size()==l)
28        {
29            List<Integer>li=new ArrayList<>();
30            li.add(root.val);
31            al.add(li);
32        }
33        else
34            al.get(l).add(root.val);
35        pre(root.left,l+1,al);
36        pre(root.right,l+1,al);
37    } 
38}