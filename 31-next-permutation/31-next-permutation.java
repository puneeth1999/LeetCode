class Solution {
    public void nextPermutation(int[] nums) {
        // Find the element to be swapped - nums[i] such that nums[i] < nums[i+1] coming from the right.
        if(nums.length < 2) return;
        int i = nums.length - 2;
        while(i >= 0){
            if(nums[i] < nums[i+1]) break;
            i--;
        }
        if(i >= 0){
            // Find the the next greater element to the right of i
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            // nums[j] will have the next greatest element after nums[i]
            // Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        // reverse everything to the right of i.
        int left = i+1, right = nums.length - 1;
        while(left < right){
            // swap the elements
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            left++; right--;
        }
    }
}