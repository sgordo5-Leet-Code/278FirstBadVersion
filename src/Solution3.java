public class Solution3 {
    //still too slow
    public int firstBadVersion(int n, int bad) {
        int answer = 1;
        while (!isBadVersion(answer, bad)) {
            answer += 2;
        }

        if (isBadVersion(answer - 1, bad)) {
            answer--;
        }

        return answer;
    }

    private boolean isBadVersion(int version, int bad) {
        //System.out.println(version + " is bad? " + (version >= bad));
        return version >= bad;
    }
}
