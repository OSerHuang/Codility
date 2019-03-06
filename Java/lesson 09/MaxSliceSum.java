// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = Integer.MIN_VALUE;
        int pre_sum = 0;
        for (int val: A) {
            if (pre_sum < 0) pre_sum = 0;
            pre_sum += val;
            if (result < pre_sum) result = pre_sum;
        }
        return result;
    }
}