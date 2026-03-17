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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        maxPath(root);
        return max;
    }
    public int maxPath(TreeNode root) {
    if(root==null)
            return 0;
    int left = Math.max(maxPath(root.left), 0);
        int right=Math.max(maxPath(root.right), 0);
        int pathSum=root.val+left+right;
        max= Math.max(max, pathSum);
        return root.val + Math.max(left, right);

}
}