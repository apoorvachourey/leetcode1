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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        List<TreeNode> res = new ArrayList<>();
        for(int a:to_delete){
            set.add(a);
        }
        if(root!=null && !set.contains(root.val)){
            res.add(root);
        }
        postorder(root,set,res,null);
        return res;
    }
    
    public void postorder(TreeNode root, Set<Integer> set , List<TreeNode> res,TreeNode prev){
        
        if(root==null) return;
        postorder(root.left,set,res,root);
        postorder(root.right,set,res,root);
        
        if(set.contains(root.val)){
            if(prev!=null){
                if(prev.left==root){
                    prev.left=null;
                }else{
                    prev.right=null;
                }
            }
            
            if(root.left!=null){
                res.add(root.left);
            }
            
            if(root.right!=null){
                res.add(root.right);
            }
        }
        
    }
}