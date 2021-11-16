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
    public boolean isCousins(TreeNode root, int x, int y) {
         if(root == null) return false;
         if(root.val==x || root.val==y) return false;
         Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
       
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean isX = false;
            boolean isY = false;
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(temp.val==x) isX=true;
                if(temp.val==y) isY=true;
                if(temp.left!=null && temp.right!=null){
                    if(temp.left.val==x && temp.right.val==y){
                        return false;
                    }
                    if(temp.left.val==y && temp.right.val==x){
                        return false;
                    }
                    
                }
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
        }
        if(isX && isY) return true;
    }
        return false;
}
}