class Solution {
    public char findTheDifference(String s, String t) {
        int a = 0;
        // Leveraging the property of XOR operation
        // a ^ 0 = a
        // a ^ a = 0
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            a = a ^ c;
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            a = a ^ c;
        }
        // if both the strings are the same, after the second for loop, a should be equal to 0. Else, it should give the extra letter's ascii number
        return (char)a;
    }
}