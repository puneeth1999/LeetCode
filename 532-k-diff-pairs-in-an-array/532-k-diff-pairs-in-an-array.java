class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i, 1);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            if(k == 0){
                if(map.get(key) > 1){
                    ans++;
                }
            }
            else if(map.containsKey(key + k)){
                ans++;
            }
        }
        return ans;
    }
}