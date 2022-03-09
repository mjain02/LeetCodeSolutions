/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1, last = n;
        int mid = 0;
        int version = 0;
        while (first <= last) {
            mid = (first) + (last - first)/2;
            if (isBadVersion(mid)) {
                last = mid - 1;
                version = mid;
            } else {
                first = mid + 1;
            }
        }
        return version;
    }
}