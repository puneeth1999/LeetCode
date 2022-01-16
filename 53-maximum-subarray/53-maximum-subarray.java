import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int max_sum = 0, curr_sum = 0;
        for(int i = 0; i < nums.length; i++){
            curr_sum += nums[i];
            if(curr_sum > max_sum)
                max_sum = curr_sum;
            if(curr_sum < 0)
                curr_sum = 0;
        }
        if(max_sum == 0){
            // find the largest element in the array
            max_sum = nums[0];
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > max_sum) max_sum = nums[i];
            }
        }
        return max_sum;
    }
}