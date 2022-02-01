class Solution {
    public void sortColors(int[] nums) {
        int zeroes = 0;
        int ones   = 0;
        int twos   = 0;
        // Two pass algorithm
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zeroes++;
            else if(nums[i] == 1) ones++;
            else twos++;
        }
        // zeroes
        int i = 0;
        while(zeroes != 0){
            nums[i] = 0;
            zeroes--;
            i++;
        }
        // ones
        while(ones != 0){
            nums[i] = 1;
            ones--;
            i++;
        }
        // twos
        while(twos != 0){
            nums[i] = 2;
            twos--;
            i++;
        }
    }
}