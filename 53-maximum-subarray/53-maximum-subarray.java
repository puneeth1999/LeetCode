import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int maximum = nums[0];
        int currSum = 0;
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            if(currSum < 0){
                currSum = 0;
            } else {
                maximum = Math.max(maximum, currSum);
            }
        }
        if(maximum == nums[0]){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > maximum){
                    maximum = nums[i];
                }
            }
        }
        return maximum;
    }
}