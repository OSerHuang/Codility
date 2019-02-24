// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (K == 0 || A.length == 0) return A;
        K = K % A.length;
        int[] temp = new int[K];
        for (int i = 0; i < K; i++) {
            temp[i] = A[A.length - K + i];
        }
        for (int i = A.length - 1; i - K >= 0; i--) {
            A[i] = A[i - K];
        }
        for (int i = 0; i < K; i++) {
            A[i] = temp[i];
        }
        return A;
    }
}