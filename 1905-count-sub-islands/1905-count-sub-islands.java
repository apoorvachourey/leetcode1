class Solution {
    int totalRow;
    int totalCol;
    
    public int countSubIslands(int[][] grid1, int[][] grid2) {
         totalRow = grid2.length;
         totalCol = grid2[0].length;
        int subIslandsCount =0;
        boolean visited [][] = new boolean[totalRow][totalCol];
        for(int row = 0; row<totalRow;row++){
            for(int col=0;col<totalCol;col++){
             if(grid2[row][col]==1 && !visited[row][col] && dfs(row,col,grid1,grid2,visited)){
                    subIslandsCount++;
             }
            }
        }
        return subIslandsCount;
        
    }
    private boolean dfs(int row, int col, int[][] grid1,int[][] grid2, boolean visited[][]){
        boolean result = true;
        if(row<0 || row>=totalRow || col<0 || col>=totalCol || grid2[row][col]==0 || visited[row][col]){
            return true;
        }
        visited[row][col] = true;
        if(grid1[row][col]==0){
            result=false;
        }
        grid2[row][col]=0;
        int adj[][] = {{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int neighbour[] : adj){
            int r = neighbour[0];
            int c = neighbour[1]; 
            result = dfs(r,c,grid1,grid2,visited) && result;
        }
        return result;
    }
}