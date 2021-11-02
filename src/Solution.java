public class Solution {
    //Solution is too slow it exceeded the time limit
    public int firstBadVersion(int n, int bad) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            if (isBadVersion(i, bad)) {
                answer = i;
            }
        }
        return answer;
    }

    private boolean isBadVersion(int version, int bad) {
        //System.out.println(version + " is bad? " + (version == bad));
        return version == bad;
    }
}
