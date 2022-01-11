class Solution {
    public int findNumbers(int[] nums) {
        int numberOfEvenDigitNumbers = 0;
        for(int n : nums){
            int count = countDigits(n);
            if(count % 2 == 0)
                numberOfEvenDigitNumbers++;
        }
        return numberOfEvenDigitNumbers;
    }
    public int countDigits(int n){
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
}