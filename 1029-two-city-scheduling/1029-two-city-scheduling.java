class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->(a[0]-a[1])-(b[0]-b[1]));
        int cost = 0;
        int n = costs.length;
        for(int i=0;i<n/2;i++){
            cost+=costs[i][0]+costs[i+n/2][1];
        }
        return cost;
        
    }
}
