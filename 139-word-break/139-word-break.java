class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // create a cache
        boolean [] dp = new boolean[s.length()+1];
        dp[s.length()] = true;
        
        // move from the end of the string starting with one character
        for(int i = s.length()-1; i > -1; i--){
            for(String word : wordDict){
                // check if the length is enough to compate and if the strings are equal, check if the remainder is true
                if((i + word.length() <= s.length()) && (s.substring(i,i + word.length()).equals(word))){
                    dp[i] = dp[i+word.length()];
                }
                if(dp[i] == true)
                    break;
            }
        }
        return dp[0];
    }
}