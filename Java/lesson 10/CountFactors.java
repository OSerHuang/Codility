// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
        for (int i = 1; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                result += 2;
            }
        }
        if (N % Math.sqrt(N) == 0) result++;
        return result;
    }
}