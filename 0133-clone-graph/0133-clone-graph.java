/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return node;
        }
        HashMap<Node,Node> visited = new HashMap<>();
        return clone(node,visited);        
    }
    private Node clone(Node node, HashMap<Node,Node> visited){
        if(visited.containsKey(node)) return visited.get(node);
        Node clone = new Node(node.val,new ArrayList<>());
        visited.put(node, clone);
        for(Node child : node.neighbors){
            clone.neighbors.add(clone(child,visited));
        }
        return clone;


    }
}