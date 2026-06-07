class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean visited[] = new boolean[rooms.size()];
        dfs(0,rooms,visited);
        for(boolean room : visited) {
            if(!room) {
            return false;
            }
        
        }
    return true;
}
    private void dfs(int node, List<List<Integer>> rooms,boolean visited[]){
        if(visited[node]){
                return;
            }
        visited[node]=true;
        for(int neighbour : rooms.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour, rooms, visited);
            }
        }

    }


}