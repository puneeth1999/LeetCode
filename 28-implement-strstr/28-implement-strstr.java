class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        int needleLen = needle.length();
        char needlePoint = needle.charAt(0);
        for(int i = 0; i <= haystack.length() - needleLen; i++){
            if(haystack.charAt(i) == needlePoint){
                String curr = haystack.substring(i, i+needleLen);
                if(curr.equals(needle))
                    return i;
            }
        }
        return -1;
    }
}