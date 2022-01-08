/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left <= right){
            int p = left + ((right - left) / 2); // p as in pivot
            if(isBadVersion(p))
                right = p - 1;
            else
                left = p + 1;
        }
        return left;
    }
}