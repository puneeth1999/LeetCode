import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        // This two pointer approach is going to take extra space O(N)
        int l = 0, r = nums.length - 1;
        int[] res = new int[nums.length];
        for(int end = nums.length - 1; end >= 0; end--){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                res[end] = nums[l]*nums[l];
                l ++;
            } else{
                res[end] = nums[r] * nums[r];
                r --;
            }
        }
        return res;
    }
   
}