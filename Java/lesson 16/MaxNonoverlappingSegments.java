// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int res = 0;
        int last_end = -1;
        for (int i = 0; i < A.length; i++) {
            if (last_end < A[i]) {
                res++;
                last_end = B[i];
            }
        }
        return res;
    }
}