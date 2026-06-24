class Solution {
    public boolean validTree(int n, int[][] edges) {
        boolean visited[] = new boolean[n];
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i, new ArrayList<>());
        }
        for(int edge [] : edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
         // A cycle means it cannot be a tree.
        if (dfs(0, -1, visited, graph)) {
            return false;
        }
        
        // Every node must be connected to node 0.
        for (boolean nodeVisited : visited) {
            if (!nodeVisited) {
                return false;
            }
        }

        return true;
         
        
    }
    private boolean dfs(int node, int parent, boolean visited[], HashMap<Integer, List<Integer>> graph){
            visited[node]= true;
            for(int neighbour : graph.get(node)){
                if(neighbour==parent)continue;
                if (visited[neighbour]) {
                return true;
            }

            if (dfs(neighbour, node, visited, graph)) {
                return true;
            }
            }
        


        return false;
    }
}