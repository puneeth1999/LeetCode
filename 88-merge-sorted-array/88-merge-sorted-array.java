class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while(i < m && j < n){
            if(nums1[i] >= nums2[j]){
                shiftAndInsert(nums2[j], i, nums1);
                j++;
                m++;
            }
            i++;
        }
        while(j < n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
    public void shiftAndInsert(int a, int idx, int[] arr){
        int x = arr.length - 1;
        while(x > idx){
            arr[x] = arr[x-1];
            x--;
        }
        arr[idx] = a;
    }
}