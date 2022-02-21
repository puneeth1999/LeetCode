class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet();
        Arrays.sort(nums); // O(N LOG N)
        int j = 0, k = 0;
        for(int i = 0; i < nums.length; i++){
            j = i + 1;
            k = nums.length - 1;
            while(j < k){
                int s = nums[i] + nums[j] + nums[k];
                if(s == 0){
                    ArrayList<Integer> a = new ArrayList<Integer>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    res.add(a);
                    j++; k--;
                } else if(s > 0){
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}