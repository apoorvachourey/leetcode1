class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visited[] = new boolean[n];
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int i =0;i<n;i++){
            graph.put(i, new ArrayList<>());
        }
        // create the adj List
        for(int i= 0;i<n;i++){
            for(int j =0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    graph.get(i).add(j);
                }
            }
        }
    int count =0;
        for(int i =0;i<n;i++){
            if(!visited[i]){
                dfs(i,graph,visited);
                count++;
            }
        }
        return count;
}

private void dfs(int node, HashMap<Integer, List<Integer>> graph, boolean visited[]){
    visited[node]=true;
    for(int neighbor : graph.get(node)){
        if(!visited[neighbor]){
            dfs(neighbor, graph, visited);
        }
    }
}

}