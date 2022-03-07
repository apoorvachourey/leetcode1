class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top =0; int left = 0; 
        int right = n-1; int bottom = n-1;
        int count = 1;
        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                res[top][i]=count++;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                res[i][right]=count++;
            }    
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res[bottom][i]=count++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res[i][left]=count++;
                }
                left++;
            }
        }
        return res;
    }
}