// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long[] left_pos = new long[A.length];
        long[] right_pos = new long[A.length];
        for(int i = 0; i < A.length; i++) {
            left_pos[i] = i - (long)A[i];
            right_pos[i] = i + (long)A[i];
        }
        Arrays.sort(left_pos);
        Arrays.sort(right_pos);
        int i = 0, j = 0;
        int result = 0;
        int opened = 0;
        while (i < A.length) {
            if (left_pos[i] <= right_pos[j]) {
                result += opened;
                if (result > 10000000) return -1;
                opened++;
                i++;
            } else {
                opened--;
                j++;
            }
        }
        return result;
    }
}