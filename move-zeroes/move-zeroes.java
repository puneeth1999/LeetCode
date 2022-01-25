class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length <=1)
            return;
        int j = 0;
        while(j < nums.length && nums[j] != 0){
            j++;
        }
        int i = j+1;
        while(i < nums.length){
            if(nums[i] != 0){
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                // increment j
                j++;
            }
            i++;
        }
    }
}