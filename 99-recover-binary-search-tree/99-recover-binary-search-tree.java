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
    TreeNode firstnode = null;
    TreeNode secnode = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = firstnode.val;
        firstnode.val = secnode.val;
        secnode.val = temp;
        
    }
    
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(firstnode==null && prev.val>root.val){
            firstnode = prev;
        }
        if(firstnode!=null && prev.val>root.val){
            secnode = root;
        }
        prev = root;
        inorder(root.right);
    }
}