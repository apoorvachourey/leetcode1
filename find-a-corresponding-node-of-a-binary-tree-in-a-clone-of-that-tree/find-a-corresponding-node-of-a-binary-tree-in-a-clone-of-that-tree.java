/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        
        queue1.add(original);
        queue2.add(cloned);
        
        while(!queue1.isEmpty()){
            int size = queue1.size();
            for(int i=0;i<size;i++){
                TreeNode curr = queue1.poll();
                TreeNode currcloned = queue2.poll();
                if(curr.val==target.val){
                    return currcloned;
                }
                if(curr.left!=null){
                    queue1.add(curr.left);
                    queue2.add(currcloned.left);
                }
                if(curr.right!=null){
                    queue1.add(curr.right);
                    queue2.add(currcloned.right);
                }
            }
        }
        return null;
    }
}