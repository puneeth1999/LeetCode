class Solution {
    public void duplicateZeros(int[] arr) {
        int i = 0, j = 0;
        while(i < arr.length - 1){
            if(arr[i] == 0){
                int p = i+1;
                j = i + 1;
                int temp = arr[j];
                while(j < arr.length - 1){
                    int temp2 = arr[j+1];
                    arr[j + 1] = temp;
                    temp = temp2;
                    j++;
                }
                if(p < arr.length)
                    arr[p] = 0;
                i += 2;
            }
            else{
                i++;
            }
        }
    }
}