// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int i = 0, j = A.length - 1;
        int res = Integer.MAX_VALUE;
        while (i <= j) {
            int sum = A[i] + A[j];
            if (res > Math.abs(sum)) res = Math.abs(sum);
            if (sum < 0) {
                i++;
            } else if (0 < sum) {
                j--;
            } else {
                break;
            }
        }
        return res;
    }
}