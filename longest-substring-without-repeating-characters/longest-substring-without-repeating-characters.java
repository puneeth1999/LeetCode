class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<Character>();
        int j = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            while(seen.contains(x)){
                seen.remove(s.charAt(j));
                j += 1;
            }
            seen.add(s.charAt(i));
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}