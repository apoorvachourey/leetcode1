class Solution {
    int totalRows;
    int totalCols;
    public int numDistinctIslands(int[][] grid) {
        totalRows = grid.length;
        totalCols = grid[0].length;

        boolean visited[][] = new boolean[totalRows][totalCols];
        HashSet<ArrayList<String>> set = new HashSet<>();

        for(int row=0;row<totalRows;row++){
            for(int col=0;col<totalCols;col++){
                if(grid[row][col]==1 && !visited[row][col]){
                    ArrayList<String> list = new ArrayList<>();
                    dfs(row,col,grid,visited,list,row,col);
                    set.add(list);
                }
            }
        }

        return set.size();
    }
    private void dfs(int row, int col, int[][] grid , boolean [][] visited, ArrayList<String> list, int row0, int col0){
         if(row<0 || row>=totalRows || col<0 || col>=totalCols || grid[row][col]==0 ||visited[row][col]){
                return;
            }
         visited[row][col]=true;
         list.add(toString(row-row0,col-col0));
         int adjList[][]={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
         for(int neighbour[] : adjList ){
            int r = neighbour[0];
            int c = neighbour[1];
            dfs(r,c,grid,visited,list,row0,col0);
         }
    }

    private String toString (int r, int c){
        return Integer.toString(r)+" "+Integer.toString(c);
    }
}