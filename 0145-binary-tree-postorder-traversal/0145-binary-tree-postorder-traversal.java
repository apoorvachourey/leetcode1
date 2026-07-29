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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node!=null){
            //keep going left
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
            if(stack.peek().right!=null){
                node = stack.peek().right;
            }else{
                TreeNode temp = stack.pop();
                result.add(temp.val);
                while(!stack.isEmpty() && temp==stack.peek().right){
                    temp = stack.pop();
                    result.add(temp.val);
                }

            }
        }
        return result;
    }
}