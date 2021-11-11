/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node inorderSuccessor(Node node) {
       if(node.right==null){
           Node res = node.parent;
           while(res!=null && res.val<node.val){
               res = res.parent;
           }
           return res;
       }else{
           Node res = node.right;
           while(res.left!=null){
               res= res.left;
           }
           return res;
       }
    }
}