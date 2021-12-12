import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String res = "";
        String[] st = s.split(" ");
        for(int i = 0; i < st.length; i++){
            for(int j = st[i].length() - 1 ; j >= 0; j--){
                res += st[i].charAt(j);
            }
            if(i != st.length - 1)
                res += " ";
        }
        return res;
    }
}