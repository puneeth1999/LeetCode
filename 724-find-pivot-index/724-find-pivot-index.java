class Solution {
    public int pivotIndex(int[] nums) {
        int arraySum = 0;
        for(int i = 0; i < nums.length; i++){
            arraySum += nums[i];
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(arraySum - leftSum - nums[i] == leftSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}