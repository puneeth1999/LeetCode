class Solution {
    public int addDigits(int num) {
        // The values keep repeating
        /*
        1 - 1   10 - 1
        2 - 2   11 - 2
        3 - 3   12 - 3
        4 - 4   13 - 4
        5 - 5   14 - 5
        6 - 6   15 - 6
        7 - 7   16 - 7
        8 - 8   17 - 8
        9 - 9   18 - 9
        we can observe that if the number is completely divisible my 9, it returns 9 else, it returns num % 9. Edge case is 0 in which case, it returns 0.
        */
        if(num == 0) return 0;
        if(num % 9 == 0) return 9;
        return num % 9;
    }
}