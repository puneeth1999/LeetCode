class Solution {
    public int longestConsecutive(int[] nums) {
        // Add all the elements to the hashset.
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        // Once all the elements are in the hash set, we are going to iterate over the hash set.
        int longestConsStreak = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                // If it enters the loop, it means that this is the beginning of the streak.
                int currentStreak = 1;
                int currentNum = num;
                // Keep incrementing the currentStreak if num+1 is there in the hash set.
                while(set.contains(currentNum + 1)){
                    currentStreak++;
                    currentNum++;
                }
                longestConsStreak = Math.max(longestConsStreak, currentStreak);

            }
        }
        return longestConsStreak;
    }
}