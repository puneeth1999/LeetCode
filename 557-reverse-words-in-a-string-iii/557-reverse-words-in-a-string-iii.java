import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] a = split(s);
        StringBuilder sb = new StringBuilder();
        for(String x : a){
            String y = reverse(x);
            sb.append(y);
        }
        return sb.toString();
    }
    public String[] split(String s){
        ArrayList<String> arrayList = new ArrayList<String>();
        int i = 0, j = 0;
        for(i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                arrayList.add(s.substring(j, i));
                arrayList.add(" ");
                j = i + 1;
            }
        }
        if(s.substring(j, i-1) != "")
            arrayList.add(s.substring(j, i));
        return arrayList.toArray(new String[arrayList.size()]);
    }
    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0 ; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}