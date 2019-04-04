// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res = 0;
        int high = A[0];
        int low = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) {
                if (A[i] <= high) {
                    if (res < A[i] - low) res = A[i] - low;
                } else {
                    if (res < high - low) res = high - low;
                    high = A[i];
                    low = A[i];
                }
            } else {
                if (A[i] < low) low = A[i];
            }
        }
        return res;
    }
}