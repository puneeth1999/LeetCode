class Solution {
    public int search(int[] nums, int target) {
        // [4, 5, 6, 7, 0, 1, 2]
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] ==  target) return mid;
            if(nums[mid] >= nums[l]){
                if(nums[mid] < target || nums[l] > target){
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if(nums[mid] > target || nums[r] < target){
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}