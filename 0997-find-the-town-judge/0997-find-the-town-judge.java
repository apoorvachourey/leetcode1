class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length < n-1){
             return -1; 
        }
        int [] degree = new int[n+1];

        for(int[] relation : trust){
            degree[relation[0]]--; //out
            degree[relation[1]]++; //in
        }
        
        for(int i=1;i<=n;i++){
            if(degree[i]== n-1 ){
                return i;
            }
        }
        
        return -1;
    }
}