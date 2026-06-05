class Solution {
    int totalRow;
    int totalCol;
     public int maxAreaOfIsland(int[][] grid){
        totalRow = grid.length;
        totalCol= grid[0].length;
        int maxArea = 0;
       boolean [][] visited = new boolean[totalRow][totalCol];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    maxArea = Math.max(maxArea,dfs(grid,i,j,visited));
                }
                
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col, boolean [][] visited ){
        if(row<0 || row>=totalRow || col<0 || col>=totalCol || visited[row][col] || grid[row][col]==0){
            return 0;
        }
        visited[row][col]=true;
        int area = 1;
        int adjList[][]={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int neighbour[]:adjList){
            int r = neighbour[0];
            int c = neighbour[1];
            area = area+dfs(grid,r,c,visited);
        }

        return area;
    }

}