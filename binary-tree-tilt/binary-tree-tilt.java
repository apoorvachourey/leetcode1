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
        int res;
    }
    public int findTilt(TreeNode root) {
        Pair p = new Pair();
        helper(root,p);
        return p.res;
        
    }
    
    public int helper(TreeNode root,Pair p){
        if(root==null) return 0; 
        int left = helper(root.left,p);
        int right = helper(root.right,p);
        p.res += Math.abs(left - right);
        return left+right+root.val;
    }
}