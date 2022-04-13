class Solution {
    public void gameOfLife(int[][] board) {
        //don't do anything if board is not valid
       // if(board==null || board.length==0) return;
        
        //8 directions
        int dx[] = {0, 0, 1, 1, 1, -1, -1, -1};
        int dy[] = {1, -1, 1, -1, 0, 0, 1, -1};
        
        //iterate and check for each live or dead cell
        //how many live neighbour for each cell
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                
                int liveNeighbours = 0;
                
            for(int k=0;k<8;k++){
              int x = row+dx[k]; 
                int y = col+dy[k];
                
                    if(isValid(x,y,board) && Math.abs(board[x][y])==1) liveNeighbours++;   
            }
            
            if (board[row][col] == 1 && (liveNeighbours < 2 || liveNeighbours > 3))
                    board[row][col] = -1;
                
                if (board[row][col] == 0 && liveNeighbours == 3)
                    board[row][col] = 2;     
     

                       
            }              
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]>=1){
                    board[i][j]=1;
                }else{
                    board[i][j]=0;
                }
                
            }
        }
}
    public boolean isValid(int x, int y, int[][] board){
        if(x<0 || y<0 || x>=board.length || y>=board[0].length){
            return false;
        }
        
        return true;
    }                       
}
                       
                       