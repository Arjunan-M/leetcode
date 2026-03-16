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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
            return false;
        if(issame(root,subRoot))
            return true;
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    public boolean issame(TreeNode t, TreeNode t1)
    {
        if(t==null && t1==null)
            return true;
        if(t==null || t1==null)
            return false;
        if(t.val!=t1.val)
            return false;
        return issame(t.left,t1.left) && issame(t.right,t1.right);
    }
}