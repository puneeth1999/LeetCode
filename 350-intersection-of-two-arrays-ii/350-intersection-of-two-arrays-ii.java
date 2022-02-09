class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = Math.max(nums1.length, nums2.length);
        int [] res = new int[n];
        int i = 0, j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res[k] = nums1[i];
                i++; j++; k++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}