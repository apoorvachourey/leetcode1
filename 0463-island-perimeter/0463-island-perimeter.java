class Solution {
    int totalRows;
    int totalCols;
    public int islandPerimeter(int[][] grid) {
        totalRows = grid.length;
        totalCols = grid[0].length;
        int islandPerimeter = 0;
        for(int i=0;i<totalRows;i++){
            for(int j=0;j<grid[0].length;j++){
                 if (grid[i][j] == 1) {
                islandPerimeter += dfs(i,j,grid);
                 }
            }
        }
        return islandPerimeter;
    }
private int dfs(int row, int col, int [][] grid){
    int count =0;
    if(row<0 || row>=totalRows || col<0 || col>=totalCols || grid[row][col] ==0){
        return 1;
    }
    if(grid[row][col] == -1){
        return 0;
    }
    grid[row][col]=-1;
    int adj[][] = {{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
    for(int neighbour[] : adj){
        int r = neighbour[0];
        int c = neighbour[1];
        count +=  dfs(r,c,grid);
    }
    return count;
}

}