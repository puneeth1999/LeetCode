class Solution {
    public boolean isAnagram(String s, String t) {
        int[] mapS = new int [26];
        int[] mapT = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int idx = c - 'a';
            mapS[idx]++;
        }
        
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            int idx = c - 'a';
            mapT[idx]++;
        }
        boolean bool = false;
        for(int i = 0; i < 26; i++){
            if(mapS[i] == mapT[i]){
                bool = true;
            } else {
                return false;
            }
        }
        return bool;
    }
}