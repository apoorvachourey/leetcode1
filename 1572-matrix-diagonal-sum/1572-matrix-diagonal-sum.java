class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            sum+=mat[n-1-i][i];
        }
       
        if(mat.length%2!=0){
            sum=sum-mat[n/2][n/2];
        }
        return sum;
    }
}