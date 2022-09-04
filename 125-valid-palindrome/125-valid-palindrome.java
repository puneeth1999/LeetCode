class Solution {
    public boolean isPalindrome(String s) {
        String fin = "";
        for(int i = 0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(c))
                fin+=c;
        }
        System.out.println(fin);
        int left = 0, right = fin.length() - 1;
        while(left < right){
            if(fin.charAt(left) != fin.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}