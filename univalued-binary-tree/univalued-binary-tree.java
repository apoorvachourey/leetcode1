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
        int val =-1;
    }
    public boolean isUnivalTree(TreeNode root) {
        Pair p  = new Pair();
        return helper(root,p);
    }
    
    public boolean helper(TreeNode root,Pair p){
        if(root==null) return true;
        if(p.val<0){
        p.val = root.val;
        }
        boolean left = helper(root.left,p);
        boolean right = helper(root.right,p);
        return p.val==root.val && left && right;
        
    }
}