// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
        int temp = -1;
        while (N != 0) {
            int x = N % 2;
            N = N / 2;
            if (temp >= 0 && x == 0) {
                temp++;
            } else if (x == 1) {
                if (temp < 0) {
                    temp = 0;
                } else {
                    result = result > temp? result: temp;
                    temp = 0;
                }
            }
        }
        return result;
    }
}