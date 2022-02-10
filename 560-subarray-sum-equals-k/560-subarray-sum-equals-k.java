class Solution {
    public int subarraySum(int[] nums, int k) {
        // Using extra space
        int ans = 0;
        int[] adds = new int[nums.length + 1];
        adds[0] = 0;
        for(int i = 1; i < adds.length; i++){
            adds[i] = nums[i-1] + adds[i-1];
        }
        for(int i = 0; i < adds.length; i++){
            for(int j = i+1; j < adds.length; j++){
                if(adds[j] - adds[i] == k){
                    ans++;
                }
            }
        }
        return ans;
    }
}