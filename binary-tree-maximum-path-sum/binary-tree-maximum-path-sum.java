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
    class Pair{
        int maxval = Integer.MIN_VALUE;
    }
    public int maxPathSum(TreeNode root) {
        Pair p = new Pair();
        int width = helper(root,p);
        return p.maxval;
        
    }
    public int helper(TreeNode root, Pair p){
        if(root==null) return 0;
        int left = Math.max(0,helper(root.left,p));
        int right = Math.max(0,helper(root.right,p));
        p.maxval = Math.max(p.maxval,(root.val+left+right));
        return root.val + Math.max(left,right) ;
    }
}