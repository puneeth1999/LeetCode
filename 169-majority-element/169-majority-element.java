class Solution {
    public int majorityElement(int[] nums) {
        int minTimes = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        // Iterate over the entries and find the max
        int me = nums[0];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > minTimes) me = entry.getKey();
        }
        return me;
    }
}