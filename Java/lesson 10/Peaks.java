// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] peak_counter = new int[A.length + 1];
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peak_counter[i + 1] = peak_counter[i] + 1;
            } else {
                peak_counter[i + 1] = peak_counter[i];
            }
        }
        peak_counter[A.length] = peak_counter[A.length - 1];
        
        for (int i = peak_counter[A.length]; i > 0; i--) {
            if (A.length % i != 0) continue;
            int len = A.length / i;
            Boolean isValid = true;
            for (int start = 0; start <= A.length - len; start += len) {
                if (peak_counter[start + len] - peak_counter[start] <= 0) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) return i;
        }
        return 0;
    }
}