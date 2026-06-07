class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int numberOfComp = 0;
        boolean visited[] = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited,isConnected);
                numberOfComp++;
            }
        }
        return numberOfComp;   
    }

    private void dfs(int node, boolean visited[], int[][] isConnected){
            visited[node] = true;
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[node][i]==1 && !visited[i]){
                    dfs(i,visited,isConnected);
                }
            }
    }
}