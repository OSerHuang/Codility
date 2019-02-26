// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int left = 0, right = 0;
        for (int val: A) {
            right += val;
        }
        int result = Integer.MAX_VALUE;
        int temp;
        for (int i = 0; i < A.length - 1; i++) {
            left += A[i];
            right -= A[i];
            temp = Math.abs(left - right);
            if (temp < result) {
                result = temp;
            }
        }
        return result;
    }
}