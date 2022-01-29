class Solution {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        while(i < arr.length){
            if(arr[i] == 0){
                int j = arr.length - 1;
                while(j > i){
                    arr[j] = arr[j-1];
                    j--;
                }
                i++;
            }
            i++;
        }
    }
}