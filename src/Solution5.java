public class Solution5 {
    //saw this in the solution and used it to understand binary search.
    public int firstBadVersion (int n, int bad) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid, bad)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version, int bad) {
        //System.out.println(version + " is bad? " + (version >= bad));
        return version >= bad;
    }
}
