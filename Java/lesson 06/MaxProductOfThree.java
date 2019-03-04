// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int len = A.length;
        return A[len - 1] * A[len - 2] * A[len - 3] > A[0] * A[1] * A[len - 1]? A[len - 1] * A[len - 2] * A[len - 3]: A[0] * A[1] * A[len - 1];
    }
}