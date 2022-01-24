class Solution {
    public int myAtoi(String s) {
        // Strip from the front
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        // + or -
        // sign = +1, if it's positive number, otherwise sign = -1. 
        int sign = 1;
        if (i < s.length() && s.charAt(i) == '+') {
            sign = 1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        // Iterate through the string, get each char and convert the char to int and add it to total sum.
        int sum = 0;
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            char c = s.charAt(i);
            int number = c - '0';
            // Clamping
            if(sum > Integer.MAX_VALUE / 10 || ((sum == Integer.MAX_VALUE / 10) && number > Integer.MAX_VALUE % 10)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            sum = (sum * 10) + number;
            i++;
        }
        return sum * sign;
    }
}