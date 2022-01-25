class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1] += 1;
            return digits;
        }
        int i = digits.length - 1;
        int j = digits.length;
        int[] res = new int[j+1];
        int carry = 1;
        while(i >= 0){
            int sum = digits[i] + carry;
            if(sum >= 10){
                carry = 1;
                sum %= 10;
                res[j] = sum;
            }else{
                carry = 0;
                res[j] = sum;
            }
            i--; j--;
        }
        if(carry == 1){
            res[j] = carry;
            return res;
        }
        return Arrays.copyOfRange(res, 1, res.length);
    }
}