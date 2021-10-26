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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left = leftHeight(root);
        int right = rightHeight(root);
        
        if(left==right){
            int ans = (int)Math.pow(2,left) -1;
            return ans;
        }else{
            return countNodes(root.left) + countNodes(root.right) +1;
        }
        
    }
    
    public int leftHeight(TreeNode root){
        TreeNode current = root;
        int count =0;
        while(current!=null){
            count++;
            current =current.left;
        }
        return count;
    }
    public int rightHeight(TreeNode root){
        TreeNode current = root;
        int count =0;
        while(current!=null){
            count++;
            current =current.right;
        }
        return count;
    }
}