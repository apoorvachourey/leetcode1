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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
         if(root==null) return result;
        if(!isLeaf(root)){
            result.add(root.val);
        }
        leftView(root,result);
        leafNodes(root,result);
        rightView(root,result);
        
        return result;
        
    }
     public Boolean isLeaf(TreeNode root) {
        return (root.left == null) && (root.right == null);
    }
    
    public void leftView(TreeNode root, List<Integer> result){
        TreeNode curr = root.left;
        while(curr!=null){
            if(!isLeaf(curr)){
                result.add(curr.val);
            }
            if(curr.left!=null){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
            
        }
    }
    
    public void leafNodes(TreeNode root, List<Integer> result){
        if(root == null )return ;
        if(isLeaf(root)){
            result.add(root.val);
        }
        
        if (root.left != null) leafNodes(root.left,result);
        if (root.right != null)leafNodes(root.right,result);
    }
    
    public void rightView(TreeNode root,List<Integer> result){
        TreeNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
         while(curr!=null){
            if(!isLeaf(curr)){
                temp.add(curr.val);
            }
            if(curr.right!=null){
                curr = curr.right;
            }else{
                curr = curr.left;
            }
            
        }
         for(int i=temp.size()-1;i>=0;--i){
             result.add(temp.get(i));
         }
        
    }
    
}