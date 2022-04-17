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
    public TreeNode increasingBST(TreeNode root) {
        return increasingConversion(root,null);
    }
    
    public TreeNode increasingConversion(TreeNode root, TreeNode next){
        if(root==null) return next;
        
        TreeNode node = increasingConversion(root.left, root);
        root.left = null;
        root.right = increasingConversion(root.right,next);
        
        return node;
    }
}