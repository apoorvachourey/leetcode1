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
    public int goodNodes(TreeNode root) {
        return preorder(root,root.val);
    }
    
    public int preorder(TreeNode root, int val){
        if(root==null) return 0;
        int max = Math.max(root.val,val); //max so far
        int count = (root.val >= val ? 1 : 0);
        int left = preorder(root.left,max);
        int right = preorder(root.right,max);
        return count+left+right;
        
    }
}