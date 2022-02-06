class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0; int j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            int x = matrix[i][j];
            if(x == target) return true;
            if(x > target) j--;
            else i++;
        }
        return false;
    }
}