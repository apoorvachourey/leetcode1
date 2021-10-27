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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        postorder(root1,res1);
        postorder(root2,res2);
        return res1.equals(res2);
    }
    
    public void postorder(TreeNode root,ArrayList<Integer> res){
        if(root==null)return;
        postorder(root.left,res);
        postorder(root.right,res);
        if(root.left==null && root.right==null){
            res.add(root.val);
        }
        
    }
}