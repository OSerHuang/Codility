// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];
        int pre_max_val = 0;
        int cur_max_val = 0;
        for (int val: A) {
            if (val == N + 1) {
                pre_max_val = cur_max_val;
            } else {
                result[val - 1] = (result[val - 1] > pre_max_val? result[val - 1]: pre_max_val) + 1;
                if (cur_max_val < result[val - 1]) cur_max_val = result[val - 1];
            }
        }
        for (int i = 0; i < N; i++) {
            if (result[i] < pre_max_val) result[i] = pre_max_val;
        }
        return result;
    }
}