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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        helper(root,"",res);
        return res;
    }
    
    public void helper(TreeNode root,String path, List<String> res){
        if(root!=null){
        path+=Integer.toString(root.val);
            if((root.left==null && root.right==null)){
                res.add(path);
            }else{
                path+="->";
        helper(root.left,path,res);
        helper(root.right,path,res);
            }
        }
    }
    
}