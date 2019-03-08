// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        for (int i = (int)Math.sqrt(N); i > 0; i--) {
            if (N % i == 0) return 2 * (i + N / i);
        }
        return 0;
    }
}