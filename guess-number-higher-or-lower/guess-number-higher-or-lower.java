/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(n==1) return n;
        int left = 1, right = n;
        int mid = 0;
        while(left <= right){
            mid = left + (right-left)/2;
            int g = guess(mid);
            if(g == 0) return mid;
            else if(g == 1){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return mid;
    }
}