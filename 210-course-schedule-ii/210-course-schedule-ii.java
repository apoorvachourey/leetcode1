class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj  = new ArrayList<>();
        for(int i=0;i<numCourses; i++){
            adj.add(i,new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        if(topologicalSort(adj,numCourses,result)){
            return new int[0];
        }else{
            return result;
        }
        
    }
    
    public boolean topologicalSort(ArrayList<ArrayList<Integer>> adj,int numCourses, int[] result){
        Queue<Integer> queue = new LinkedList<>();
    
        int[] indegree = new int[numCourses];
        
        for(int i=0;i<numCourses;i++){
            for(int x: adj.get(i)){
                indegree[x]++;
            }
        }
        
        for(int i = 0; i<numCourses;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        int count =0;
        int i=0;
        while(!queue.isEmpty()){
            int u = queue.poll();
            result[i++] = u;
            for(int v: adj.get(u)){
                if(--indegree[v]==0){
                    queue.add(v);
                }
            }
            count++;
        }
        
        return (count!=numCourses);
    }
}