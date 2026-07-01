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
    public int diameterOfBinaryTree(TreeNode root) {
        int [] maxval = new int[1];
         height(root, maxval);
         return maxval[0];
    }
    public int height(TreeNode root,int [] maxval ){
        if(root==null) return 0;
        int leftHeight = height(root.left, maxval);
        int rightHeight = height(root.right, maxval);
        maxval[0] = Math.max(maxval[0],leftHeight+rightHeight);
        return 1 + Math.max(leftHeight,rightHeight);

    }
}