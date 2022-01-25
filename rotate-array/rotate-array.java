class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0) return;
        k = k % nums.length;
        // Reverse the entire array
        reverseRange(nums, 0, nums.length - 1);
        // Reverse the first section
        reverseRange(nums, 0, k - 1);
        //Reverse the remaining section
        reverseRange(nums, k, nums.length - 1);
    }
    public void reverseRange(int[] nums, int i, int j){
        while(i < j){
            // swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}