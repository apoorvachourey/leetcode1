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
        int minVal = Integer.MAX_VALUE;
        int secMinVal = Integer.MAX_VALUE;
        boolean intmax = false;
    }
    public int findSecondMinimumValue(TreeNode root) {
        Pair p = new Pair();
        helper(root,p);
        if(p.intmax==false && p.secMinVal==Integer.MAX_VALUE){
            p.secMinVal = -1;
        }
        return p.secMinVal;
    }
    
    public void helper(TreeNode root, Pair p){
        if(root==null) return;
        
        if(p.minVal>root.val){
            p.secMinVal=p.minVal;
            p.minVal=root.val;
        } else if(root.val!=p.minVal && p.secMinVal>=root.val){
            p.secMinVal = root.val;
            if(p.secMinVal==Integer.MAX_VALUE) {
                p.intmax = true;
            }
        }
    
        helper(root.left,p);
        helper(root.right,p);
        
        
    }
}