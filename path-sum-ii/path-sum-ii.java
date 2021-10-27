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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
         helper(root,targetSum,res, new ArrayList<>());
        return res;
    }
    
    public void helper(TreeNode root, int sum, List<List<Integer>> res, ArrayList<Integer> curr){
        if(root==null) return;
        
        curr.add(root.val);
        sum-=root.val;
        
        if(root.left==null && root.right==null && (sum==0)){
            res.add(new ArrayList<>(curr));
            curr.remove(curr.size()-1);
            return;
        }
        
        helper(root.left,sum,res,curr);
        helper(root.right,sum,res,curr);
        curr.remove(curr.size()-1);
    
            
    }
}