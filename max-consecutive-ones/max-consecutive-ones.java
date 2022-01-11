class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j = 0;
        int maxCount = 0;
        int count = 0;
        while(j != nums.length){
            if(nums[j] == 1){
                count++;
                if(count > maxCount)
                    maxCount = count;
            } else {
                count = 0;
            }  
            j++;
        }
        return maxCount;
    }
}