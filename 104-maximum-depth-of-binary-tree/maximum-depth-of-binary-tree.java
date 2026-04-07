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
    int c=0,m=0;
    public int maxDepth(TreeNode root) {
        return help(root);
    }
    public int help(TreeNode root)
    {
        if (root==null)
            return 0;
        int l=help(root.left);
        int r=help(root.right);
        return Math.max(l,r)+1;
    }
}