class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> indices = new ArrayList();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    int[] res = new int[2];
                    res[0] = i; res[1] = j;
                    indices.add(res);
                }
            }
        }
        for(int i = 0; i < indices.size(); i++){
            int[] arr = indices.get(i);
            int k = arr[0], l = arr[1];
            System.out.println(k +" "+l);
            makeZero(matrix, k, l);
        }
    }
    public void makeZero(int[][] nums, int i, int j){
        int r = i;
        for(int x = 0; x < nums[0].length; x++){
            nums[r][x] = 0;
        }
        int c = j;
        for(int x = 0; x < nums.length; x++){
            nums[x][c] = 0;
        }
    }
}