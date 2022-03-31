class Solution {
    public int countComponents(int n, int[][] edges) {
        int count =0; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(i,new ArrayList<Integer> ());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        boolean [] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                bfs(i,visited,adj);
            }
        }
        
        return count;
    }
    
    
    public void bfs(int s, boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s]=true;
        while(!queue.isEmpty()){
            int u = queue.poll();
            for(int v:adj.get(u)){
                if(!visited[v]){
                    visited[v]=true;
                    queue.add(v);
                }
            }
        }
    }
    
    
}