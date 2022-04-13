class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int minutes = 0; int count_fresh_oranges =0;
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> rottenQueue = new LinkedList<>();
        
        //count the total fresh oranges and put rotten oranges to queue
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    rottenQueue.add(new int[]{i,j});
                }
                if(grid[i][j]!=0){
                    count_fresh_oranges++;
                }
            }
        }
        
        // 
        int dx[] = {0,-1,0,1};
        int dy[] = {1,0,-1,0};
        int rottenCount =0;
        while(!rottenQueue.isEmpty()){
            int size = rottenQueue.size();
            rottenCount+=size;
            for(int i=0;i<size;i++){
                int [] point = rottenQueue.poll();
                for(int j =0;j<4;j++){
                    int x = point[0]+dx[j];
                    int y = point[1]+dy[j];
                    if(x<0 || y<0 || x>=row || y>=col || grid[x][y]==0 || grid[x][y]==2) continue;
                    grid[x][y]=2;
                    rottenQueue.add(new int[]{x,y});
                }
            }
            if(!rottenQueue.isEmpty()){
            minutes++;
            }
        }
        
        return rottenCount==count_fresh_oranges?minutes:-1;
        
        
    }
}