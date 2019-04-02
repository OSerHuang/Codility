// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        int max = 0;
        int[] count = new int[101];
        for (int val: A) {
            if (val < 0) val *= -1;
            if (max < val) max = val;
            sum += val;
            count[val]++;
        }
        int half = sum / 2;
        int[] dp = new int[half + 1];
        dp[0] = 1;
        for (int i = 1; i <= 100; i++) {
            if (count[i] == 0) continue;
            for (int j = 0; j <= half; j++) {
                if (dp[j] > 0) {
                    dp[j] = count[i] + 1;
                } else if (j >= i && dp[j - i] > 0) {
                    dp[j] = dp[j - i] - 1;
                }
            }
            if (dp[half] > 0) break;
        }
        int part_sum = 0;
        for (int i = half; 0 <= i; i--) {
            if (dp[i] > 0) {
                part_sum = i;
                break;
            }
        }
        return sum - part_sum * 2;
    }
}