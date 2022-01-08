class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int p = (left + right) / 2;
            if(nums[p] < target){
                left = p + 1;
            } else {
                right = p - 1;
            }
        }
        return left;
    }
}