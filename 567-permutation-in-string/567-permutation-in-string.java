import java.util.*;
class Solution {
    /* The idea:
    *   Create map of the first string.
    *   Slice the second string (each slice is just as long as first string)
    *   Get the map of the second string's slice.
    *   Compare both the maps. If any of the maps are equal, return true. 
    *   Else, at the end, after all the iterations on the second string, return false.
    */
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 > l2) return false;
        int[] s1Map = makeMap(s1);
        for(int i = 0; i <= l2 - l1; i++){
            String s2Slice = s2.substring(i, i+l1);
            int[] s2Map = makeMap(s2Slice);
            if(matches(s1Map, s2Map))
                return true;
        }
        return false;
    }
    
    // Create a map => takes a string and returns an array (map) which represents the number of times each lower-case alphabet is repeated in that string. Everytime, the length of this map is 26.
    public int[] makeMap(String str){
        int[] map = new int[26];
        for(int i = 0; i < str.length(); i++){
            map[str.charAt(i) - 'a']++;
        }
        return map;
    }
    
    // Takes the maps of two strings and returns whether they're the same.
    public boolean matches(int[] s1map, int[] s2map){
        for(int i = 0; i < 26; i++){
            if(s1map[i] != s2map[i])
                return false;
        }
        return true;
    }
}