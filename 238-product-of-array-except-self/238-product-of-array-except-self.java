class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes = 0;
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                zeroes++;
            else
                product *= nums[i];
        }
        int[] res = new int[nums.length];
        // Case 1: zeroes == 0
        if(zeroes == 0){
            for(int i = 0; i < res.length; i++){
                res[i] = product/nums[i];
            }
        }
        // Case 2: zeroes == 1
        else if(zeroes == 1){
            for(int i = 0; i < res.length; i++){
                if(nums[i] != 0)
                    res[i] = 0;
                else
                    res[i] = product;
            }
        }
        // Case 3: zeroes > 1
        else {
            for(int i = 0; i < res.length; i++){
                res[i] = 0;
            }
        }
        return res;
    }
}