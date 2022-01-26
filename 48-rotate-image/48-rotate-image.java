class Solution {
    public void rotate(int[][] matrix) {
        // First get the transpose of the image
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Now, swap the columns of the image
        int left = 0, right = matrix[0].length - 1;
        while(left < right){
            for(int i = 0; i < matrix.length; i++){
                // swap
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
            left++; right--;
        }
    }
}