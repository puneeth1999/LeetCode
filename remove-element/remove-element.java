class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        while(j < nums.length && nums[j] != val){
            j++;
        }
        for(int i = j+1; i < nums.length; i++){
            if(nums[i] != val){
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return j;
    }
}