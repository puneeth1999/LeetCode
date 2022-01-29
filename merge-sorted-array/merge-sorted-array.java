class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; int j = 0;
        while(i < m && j < n){
            if(nums2[j] < nums1[i]){
                shiftAndInsert(nums1, nums2[j], i);
                j++; m++;
            }
            i++;
        }
        while(i < nums1.length && j < n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
    public void shiftAndInsert(int[] nums1, int insertElement, int pos){
        int j = nums1.length - 1;
        while(j > pos){
            nums1[j] = nums1[j-1];
            j--;
        }
        nums1[pos] = insertElement;
    }    
}