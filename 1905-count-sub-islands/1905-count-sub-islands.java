class Solution {
    int totalRow;
    int totalCol;
    int flag =0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
         totalRow = grid2.length;
         totalCol = grid2[0].length;
        int subIslandsCount =0;
        boolean visited [][] = new boolean[totalRow][totalCol];
        for(int row = 0; row<totalRow;row++){
            for(int col=0;col<totalCol;col++){
             if(grid2[row][col]==1 && !visited[row][col]){
                    flag=1; // when dfs succeeds
                    dfs(row,col,grid1,grid2);
                    subIslandsCount=subIslandsCount+flag;
             }
            }
        }
        return subIslandsCount;
        
    }
    private void dfs(int row, int col, int[][] grid1,int[][] grid2){
        if(row<0 || row>=totalRow || col<0 || col>=totalCol || grid2[row][col]==0){
            return;
        }
        if(grid1[row][col]==0){
            flag=0;
        }
        grid2[row][col]=0;
        int adj[][] = {{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int neighbour[] : adj){
            int r = neighbour[0];
            int c = neighbour[1]; 
            dfs(r,c,grid1,grid2);
        }
    }
}