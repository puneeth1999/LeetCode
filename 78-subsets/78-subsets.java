class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outputs = new ArrayList();
        outputs.add(new ArrayList());
        for(Integer num : nums){
            List<List<Integer>> newSubsets = new ArrayList();
            for(List<Integer> op : outputs){
                newSubsets.add(new ArrayList(op){{add(num);}});
            }
            for(List<Integer> subSet : newSubsets){
                outputs.add(subSet);
            }
        }
        return outputs;
    }
}