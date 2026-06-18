class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++){
            adj.put(i, new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);

        }
             valid(source,adj,visited);
             return visited[destination];
       // return valid(int source, int destination,  ArrayList<ArrayList<Integer>> adjList ,ArrayList<Integer> visited);

    }

    void valid(int source, HashMap<Integer,List<Integer>> adj ,boolean[] visited){
           // if(source==destination) return true;
            if(visited[source]){
                return;
            }
            visited[source] = true;
            for(int neighbour : adj.get(source)){
                if(!visited[neighbour]){
                    valid(neighbour, adj, visited);
                }
            }
    }
}