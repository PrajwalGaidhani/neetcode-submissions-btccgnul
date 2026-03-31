class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int row=matrix.length;
        int col=matrix[0].length;
        int total=row*col-1;
        while(l<=total){
            int mid=l+(total-l)/2;
            int row2=mid/col;
            int col2=mid%col;
            if(matrix[row2][col2]==target){
                return true;
            }else if(matrix[row2][col2]>target){
                    total=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }   
}
