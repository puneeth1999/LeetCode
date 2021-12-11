class Solution {
    public int search(int[] nums, int target) {
        int l = nums.length;
        if(l == 0)
            return -1;
        int left = 0, right = l - 1;
        while(left <= right){
            int pivot = (right+left)/2;
            if(nums[pivot] == target)
                return pivot;
            else if(nums[pivot] < target)
                left = pivot + 1;
            else
                right = pivot - 1;
        }
        return -1;
    }
}