class Solution {
    public int search(int[] nums, int target) {
        int st = 0, ed = nums.length - 1;
        int mid = 0;
        while(st <= ed){
            mid = (st + ed) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                ed = mid - 1;
            else
                st = mid + 1;
        }
        return -1;
    }
}