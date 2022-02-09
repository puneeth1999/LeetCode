class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i : nums){
            if(freq.containsKey(i)){
                freq.put(i, freq.get(i)+1);
            } else {
                freq.put(i, 1);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int key = entry.getKey();
            if(k == 0){
                if(freq.get(key) > 1){
                    ans++;
                }
            } else if (freq.containsKey(key + k)){
                ans++;
            }
        }
        return ans;
    }
}