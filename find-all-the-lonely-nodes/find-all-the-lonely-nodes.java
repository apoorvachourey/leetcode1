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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root,null,res);
        return res;
        
    }
    
    public void postOrder(TreeNode root, TreeNode prev, List<Integer> res ){
        if(root==null) return;
        postOrder(root.left,root,res);
        postOrder(root.right,root,res);

            if(root.left==null && root.right!=null){
                res.add(root.right.val);
            }
            
            if(root.left!=null && root.right==null){
                res.add(root.left.val);
            }
        
        
    
    }
}