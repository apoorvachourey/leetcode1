class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length+1;
        int nums[] = new int[n];
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
       
         // Build graph
        for (int[] edge : adjacentPairs) {

            int u = edge[0];
            int v = edge[1];

            adj.putIfAbsent(u, new ArrayList<>());
            adj.putIfAbsent(v, new ArrayList<>());

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
       // find starting point (node with only one neighbour)
        int start = 0;

        for (int node : adj.keySet()) {
            if (adj.get(node).size() == 1) {
                start = node;
                break;
            }
        }

        HashSet<Integer> visited = new HashSet<>();

        dfs(start, -1, adj, visited, nums, 0);


        return nums;
            
    
    }

    private void dfs(int node, int parent, HashMap<Integer, List<Integer>> adj , HashSet<Integer> visited , int[] nums, int index){
        visited.add(node);
        nums[index]=node;
        for(int neighbour:adj.get(node)){
            if(!visited.contains(neighbour)){
                    dfs(neighbour, node, adj, visited, nums, index + 1);
            }
        }
    }
}