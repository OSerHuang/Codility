// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int peak_num = 0;
        int[] next_peak = new int[A.length];
        for (int i = A.length - 2; i > 0; i--) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                next_peak[i] = i;
                peak_num++;
            } else {
                next_peak[i] = next_peak[i + 1];
            }
        }
        
        int result = 0;
        for (int i = peak_num; i > 0 && result < i; i--) {
            int flag_num = 0;
            int flag = next_peak[1];
            while (flag != 0 && flag_num < i) {
                flag_num++;
                if (flag + i >= A.length - 1) break;
                flag = next_peak[flag + i];
            }
            if (flag_num > result) result = flag_num;
        }
        return result;
    }
}