class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid+1; // need to look to the right
            } else{
                right = mid-1; // need to look to the left
            }
        }
        return left;
    }
}