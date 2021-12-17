class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if(n==1) return true;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
         for(int i=0; i<n; i++){
             adj.add(i,new ArrayList<Integer>());
        }
        for(int i=0; i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        boolean [] visited = new boolean[n];
        visited[start]=true;
        return dfs(adj,start,end,visited);
        
    }
    
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int s, int d ,boolean[] visited){
        
        if(s==d) return true;
        
        for(int u:adj.get(s)){
            if(!visited[u]){
               visited[u]=true;
               boolean found =  dfs(adj,u,d,visited);
                if(found) return true;
            }
        }
        return false;
    }
}