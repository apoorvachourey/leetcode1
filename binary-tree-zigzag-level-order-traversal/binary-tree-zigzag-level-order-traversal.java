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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return result;
        queue.add(root);
        boolean leftToRight = true;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>(size);
            for(int i=0;i<size;i++){
            TreeNode current = queue.poll();
                int index = i;
                if (current != null) {
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
                
                 if(leftToRight == true) 
                 {
                     level.add(current.val);
                 }else{
                     level.add(0,current.val);
                 }   
                }
            }
            leftToRight=!leftToRight;
            result.add(level);
        }
         return result;
    }
}