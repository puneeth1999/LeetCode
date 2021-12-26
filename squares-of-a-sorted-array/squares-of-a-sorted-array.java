import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums)
    {
        int i = 0, j = nums.length - 1;
        int end = j;
        int[] res = new int[nums.length];
        while(i <= j){
            if(nums[i] * nums[i] <= nums[j] * nums[j]){
                res[end] = nums[j] * nums[j];
                j --;
            } else {
                res[end] = nums[i] * nums[i];
                i ++;
            }
            end --;
        }
        return res;
    }
   
}