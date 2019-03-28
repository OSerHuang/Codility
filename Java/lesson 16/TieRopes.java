// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int res = 0;
        int tempLen = 0;
        for (int len: A) {
            tempLen += len;
            if (K <= tempLen) {
                res++;
                tempLen = 0;
            }
        }
        return res;
    }
}