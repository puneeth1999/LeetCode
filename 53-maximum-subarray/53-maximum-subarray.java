import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int global_max = nums[0], max_current = nums[0];
        for(int i = 1; i < nums.length; i++){
            max_current = Math.max(nums[i], max_current + nums[i]);
            if(max_current > global_max){
                global_max = max_current;
            }
        }
        return global_max;
    }
}