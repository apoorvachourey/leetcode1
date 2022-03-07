class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int low =0;
            int high = matrix[i].length;
            while(low<=high && low<matrix[i].length){
                int mid= low+(high-low)/2;
                if(matrix[i][mid]==target){
                    return true;
                }else if(matrix[i][mid]>target){
                    high = mid-1;
                }else if(matrix[i][mid]<target){
                    low = mid+1;
                }
            }
        }
        return false;
    }
}