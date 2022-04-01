class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses; i++){
            adj.add(i,new ArrayList<Integer>());
        }
        
        for(int i=0;i<prerequisites.length; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        return !findCycle(adj,numCourses);
    }
    
    public boolean findCycle(ArrayList<ArrayList<Integer>> adj, int numCourses){
        int count = 0; 
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[numCourses];
        boolean [] visited = new boolean[numCourses];
        
        for(int i=0; i<numCourses; i++){
            for(int x: adj.get(i)){
                indegree[x]++;
            }
        }
        
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        
        while(!queue.isEmpty()){
            int u = queue.poll();
            for(int v : adj.get(u)){
                if(--indegree[v]==0){
                    queue.add(v);
                }
            }
            count++;
        }
        
        return (numCourses!=count);
    }
}