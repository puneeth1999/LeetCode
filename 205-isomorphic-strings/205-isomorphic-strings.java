class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map_s_t = new int[256];
        int[] map_t_s = new int[256];
        Arrays.fill(map_s_t, -1); Arrays.fill(map_t_s, -1);
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map_s_t[c1] == -1 && map_t_s[c2] == -1){
                map_s_t[c1] = c2;
                map_t_s[c2] = c1;
            } else if(map_s_t[c1] != c2 || map_t_s[c2] != c1){
                return false;
            }
        }
        return true;
    }
}