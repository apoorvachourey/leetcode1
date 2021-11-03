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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        int maxdepth = height(root);
        int[] res = {0};
        findSum(root,maxdepth,1,res);
        return res[0];
        
    }
    
    public int height(TreeNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        
        return 1+Math.max(left,right);
    }
    
    public void findSum(TreeNode root, int maxDepth, int currentDepth, int[] res) {
        if(root==null) return;
        
          if (currentDepth == maxDepth) {
            res[0] += root.val;
        }
        findSum(root.left,maxDepth,currentDepth+1,res);
        findSum(root.right,maxDepth,currentDepth+1,res);
        
    }
}