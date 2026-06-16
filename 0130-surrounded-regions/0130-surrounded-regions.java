class Solution {
    int rows;
    int cols;
    public void solve(char[][] board) {
        rows = board.length;
        cols = board[0].length;
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if((row==0||col==0||row==rows-1||col==cols-1)&&board[row][col]=='O') {
                dfs(row,col,board);
                }
            }
        }
         for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(board[row][col]=='O') board[row][col]='X';  
            }
        }

         for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(board[row][col]=='#') board[row][col]='O';  
            }
        }
    }
    private void dfs(int row, int col, char[][] board){
        if(row<0 || row>=rows || col<0 || col>=cols || board[row][col]=='X' ||  board[row][col]=='#'){
            return;
        }
       
        board[row][col]='#';
        
        
        int[][] adj = {{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int [] neighbor: adj){
            int r = neighbor[0];
            int c = neighbor[1];
            dfs(r,c,board);
        }

    }
}