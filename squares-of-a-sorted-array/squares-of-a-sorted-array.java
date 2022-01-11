class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1, end = right;
        int[] res = new int[right+1];
        while(left <= right){
            int a = Math.abs(nums[left]);
            int b = Math.abs(nums[right]);
            if(a > b){
                res[end] = a*a;
                left++;
            } else {
                res[end] = b*b;
                right--;
            }
            end--;
        }
        return res;
    }
}