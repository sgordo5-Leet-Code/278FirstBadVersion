public class Solution2 {
    //This did not get tested, it was too messy
    public int firstBadVersion(int n, int bad) {
        int answer = 1;

        for (int i = 1; i <= n; i += 2) {
            if (isBadVersion(i, bad)) {
                if (isBadVersion(i - 1, bad)) {
                    answer = i - 1;
                } else {
                    answer = i;
                }
                break;
            }
        }
        return answer;
    }

    private boolean isBadVersion(int version, int bad) {
        //System.out.println(version + " is bad? " + (version >= bad));
        return version >= bad;
    }
}
