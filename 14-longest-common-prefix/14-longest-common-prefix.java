class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = strs[0];
        for(int i = 1; i < strs.length; i++){
            String curr = strs[i];
            // If any of the strings is larger than the prefix
            while(curr.length() > 0 && curr.length() > pref.length()){
                curr = curr.substring(0, curr.length() -1);
                
            }
            // If the prefix itself is larger than any of the strings
            while(pref.length() > 0 && curr.length() < pref.length()){
                pref = pref.substring(0, pref.length()-1);
                
            }
           
            while(curr.length() > 0 && !curr.equals(pref)){
                curr = curr.substring(0, curr.length() -1);
                pref = pref.substring(0, pref.length()-1);
            }
        }
        return pref;
    }
}