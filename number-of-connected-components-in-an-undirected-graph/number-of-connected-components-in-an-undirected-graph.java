class Solution {
    public int countComponents(int n, int[][] edges) {
        int count = 0;
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(i,new ArrayList<Integer>());
        }
       boolean[] visited = new boolean[n];
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
       for(int i=0;i<n;i++){
           if(!visited[i]){
               count++;
               dfs(adj,i,visited);
           }
       } 
        return count;
        
    }
    
    
    public void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
        visited[s]=true;
        for(int u:adj.get(s)){
            if(!visited[u]){
                dfs(adj,u,visited);
            }
        }
    }
   
}