// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] <= 0) continue;
            if (A[i] == Integer.MAX_VALUE || A[i] + A[i + 1] > A[i + 2]) return 1;
        }
        return 0;
    }
}