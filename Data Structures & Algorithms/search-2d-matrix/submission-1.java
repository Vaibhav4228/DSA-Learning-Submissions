class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int low = 0;
        int high = (row * col) -1;
        while(low <= high){
            int mid = low + (high - low) /2;
            int r = mid / col;
            int c = mid % col;

            int midValue = matrix[r][c];
            if(midValue == target) return true;

            else if(midValue < target){
                low = mid +1;
            } 
            else {
               high =  mid -1;
            }
        }
        return false;
        
    }
}
