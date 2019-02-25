// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] set = new int[A.length + 1];
        for (int val: A) {
            set[val - 1] = 1;
        }
        for (int i = 0; i < A.length + 1; i++) {
            if (set[i] == 0) return i + 1;
        }
        return 0;
    }
}