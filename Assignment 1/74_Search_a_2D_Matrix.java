class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c= matrix[0].length;
        int l=0;
        int h=r*c-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int row=mid/c;
            int cols=mid%c;
            if(matrix[row][cols] == target){
                return true;
            }
            if(matrix[row][cols] <target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }

        }
        return false;
    }
}
