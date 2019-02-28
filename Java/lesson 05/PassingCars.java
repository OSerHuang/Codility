// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int one_counter = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                one_counter++;
            } else {
                result += one_counter;
                if (result > 1000000000) return -1;
            }
        }
        return result;
    }
}