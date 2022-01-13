import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<Character>();
        int maxCount = 0, j = 0;
        for(int i = 0; i < s.length(); i++){
            while(hashSet.contains(s.charAt(i))){
                hashSet.remove(s.charAt(j));
                j++;
            }
            hashSet.add(s.charAt(i));
            maxCount = Math.max(maxCount, i - j + 1);
        }        
        return maxCount;
    }
}