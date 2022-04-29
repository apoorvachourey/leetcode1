class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        int jLength = graph[i].length;
         adj.add(new ArrayList());
          for (int j = 0; j < jLength; j++) {
          adj.get(i).add(graph[i][j]);
    }
}
        
        int color[] = new int[n];
        for(int i = 0;i<n;i++) {
        	color[i] = -1; 
        }
        for(int i = 0;i<n;i++) {
        	if(color[i] == -1) {
        		if(!bfsCheck(adj, i, color)) {
        			return false; 
        		}
        	}
        }
        return true; 
    }
    
    boolean bfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int color[]) {
		Queue<Integer> q = new LinkedList<>();
		q.add(node); 
		color[node] = 1; 
		while(!q.isEmpty()) {
			Integer nde = q.poll(); 

			for(Integer it: adj.get(nde)) {
				if(color[it] == -1) {
					color[it] = 1 - color[nde]; 
					q.add(it); 
				}
				else if(color[it] == color[nde]) {
					return false; 
				}
			}
		}
		return true; 
	}
}