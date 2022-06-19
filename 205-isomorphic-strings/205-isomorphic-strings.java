class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] mapST = new int[256];
        int [] mapTS = new int[256];
        Arrays.fill(mapST, -1); Arrays.fill(mapTS, -1);
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            // If both are untouched
            if(mapST[c1] == -1 && mapTS[c2] == -1){
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } else if(mapST[c1] != c2 || mapTS[c2] != c1){
                return false;
            }
        }
        return true;
    }
}