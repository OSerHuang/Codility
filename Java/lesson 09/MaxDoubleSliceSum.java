// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] end = new int[A.length - 2];
        int[] start = new int[A.length - 2];
        for (int i = 1; i < A.length - 2; i++) {
            end[i] = Math.max(0, end[i - 1] + A[i]);
            start[A.length - 3 - i] = Math.max(0, start[A.length - 2 - i] + A[A.length - 1 - i]);
        }
        int result = 0;
        for (int i = 0; i < A.length - 2; i++) {
            if (result < end[i] + start[i]) {
                result = end[i] + start[i];
            }
        }
        return result;
    }
}