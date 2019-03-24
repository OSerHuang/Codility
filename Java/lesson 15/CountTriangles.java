// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            int j = i + 1;
            int k = i + 1;
            while (j != A.length - 1) {
                if (k != A.length - 1 && A[i] + A[j] > A[k + 1]) {
                    k++;
                } else {
                    res += k - j;
                    j++;
                    if (k < j) k = j;
                }
            }
            res += k - j;
        }
        return res;
    }
}