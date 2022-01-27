class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x, res = 0;
        while(temp != 0){
            int mod = temp % 10;
            res = (res * 10) + mod;
            temp /= 10;
        }
        return res == x;
    }
}