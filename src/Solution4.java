public class Solution4 {
    //still too slow this is obviously not working
    public int firstBadVersion(int n, int bad) {
        int answer = 1;
        while (!isBadVersion(answer, bad)) {
            answer += 3;
        }

        if (isBadVersion(answer - 1, bad)) {
            if (isBadVersion(answer - 2, bad)) {
                answer -= 2;
            } else {
                answer--;
            }
        }

        return answer;
    }

    private boolean isBadVersion(int version, int bad) {
        //System.out.println(version + " is bad? " + (version >= bad));
        return version >= bad;
    }
}
