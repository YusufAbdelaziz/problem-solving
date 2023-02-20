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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        
        return isMirrored(root.left, root.right);
    }
    
    private boolean isMirrored(TreeNode left, TreeNode right) {
        if(left == null || right == null) return right == left;
        if(left.val != right.val) return false;
        return isMirrored(left.left, right.right) && isMirrored(left.right, right.left);
    }
}