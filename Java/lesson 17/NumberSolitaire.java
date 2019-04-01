// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] dp = new int[6];
        for (int i = 0; i < 6; i++) {
            dp[i] = A[0];
        }
        int index = 0;
        for (int i = 1; i < A.length; i++) {
            int max = dp[0];
            for (int pre: dp) {
                max = Math.max(max, pre);
            }
            index = nextIndex(index);
            dp[index] = max + A[i];
        }
        return dp[index];
    }
    
    private int nextIndex(int curIndex) {
        if (curIndex == 5) {
            return 0;
        }
        return ++curIndex;
    }
}