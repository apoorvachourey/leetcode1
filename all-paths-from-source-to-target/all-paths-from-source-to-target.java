class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();  
        path.add(0);
        dfs(graph,0,graph.length-1,path,res);
        return res;
    }
    
    public void dfs(int[][] graph,int s, int d, List<Integer> path,List<List<Integer>> res){
        if(s==d){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        
        for(int u:graph[s]){
            path.add(u);
            dfs(graph,u,d,path,res);
            path.remove(path.size()-1);
        }
    }
}