// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int M, int[] A) {
        // write your code in Java SE 8
        int res = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0, j = 0; i < A.length; i++) {
            while (j < A.length && !set.contains(A[j])) {
                set.add(A[j]);
                j++;
            }
            res += j - i;
            if (res > 1000000000) return 1000000000;
            set.remove(A[i]);
        }
        return res;
    }
}