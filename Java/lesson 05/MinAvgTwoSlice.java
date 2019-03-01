// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = -1;
        double min = Float.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            double avg = (A[i] + A[i + 1]) / 2.0;
            if (avg < min) {
                min = avg;
                result = i;
            }
        }
        for (int i = 0; i < A.length - 2; i++) {
            double avg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            if (avg < min) {
                min = avg;
                result = i;
            }
        }
        return result;
    }
}