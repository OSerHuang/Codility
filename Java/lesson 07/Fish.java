// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int result = 0;
        Stack<Integer> upstream = new Stack<Integer>();
        int i = 0;
        while (i < A.length) {
            if (B[i] == 0) {
                if (upstream.empty()) {
                    result++;
                    i++;
                } else if (upstream.peek() > A[i]) {
                    i++;
                } else {
                    upstream.pop();
                }
            } else {
                upstream.push(A[i++]);
            }
        }
        while (!upstream.empty()) {
            result++;
            upstream.pop();
        }
        return result;
    }
}