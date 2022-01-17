import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] res = new int [Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, x = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else{
                res[x] = nums1[i];
                x++;
                i++;
                j++;
            }
        }
        return Arrays.copyOf(res, x);
    }
}