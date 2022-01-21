class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s == "") return "";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int L = expandAroundCenter(s, i, i);
            int R = expandAroundCenter(s, i, i+1); // In case of even length palindromes
            int len = Math.max(L, R);
            if(len > end- start){
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }
    public int expandAroundCenter(String s, int i, int j){
        int left = i, right = j;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}