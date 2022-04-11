class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int m = grid.length; 
        int n = grid[0].length;
         k %= (m * n);
        while(k!=0){
        int temp = grid[m-1][n-1];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(j==0 && i==0){
                    grid[i][j]=temp;
                }else if(j==0){
                    grid[i][j] = grid[i-1][n-1];
                }else{
                    grid[i][j] = grid[i][j-1];
                }
            }
          }
         k--;   
        }
        for(int i=0;i<m;i++){
            result.add(new ArrayList<>()) ;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result.get(i).add(grid[i][j]); 
            }
        }
        
        return result;
    }
}