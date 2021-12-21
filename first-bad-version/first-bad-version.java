/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0, r = n;
        while(l < r){
            int p = l + ((r - l) / 2);
            if(isBadVersion(p))
                r = p;
            else
                l = p + 1;
        }
        return l;
    }
}