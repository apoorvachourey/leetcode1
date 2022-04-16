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
    public TreeNode convertBST(TreeNode root) {
        int [] pre = new int[1];
        return inorder(root,pre);
    }
    
    public TreeNode inorder(TreeNode root, int[] pre){
        if(root!=null){
            inorder(root.right, pre);
            pre[0] += root.val;
            root.val = pre[0];
            inorder(root.left,pre);
        }
        return root;
    }
}