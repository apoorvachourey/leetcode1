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
    public int sumRootToLeaf(TreeNode root) {
        return preorder(root,0);
    }
    
    public int preorder(TreeNode root, int prev){
        if(root==null) return 0;
        prev = 2*prev+root.val;
         if(root.left == null && root.right == null) {
            return prev; //leaf node return the sum until root
        }
        return preorder(root.left,prev)+preorder(root.right,prev);
    }
    
    
}