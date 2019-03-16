// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        int min = findMax(A);
        int max = M * (A.length / K + 1);
        while (min < max) {
            int mid = (min + max) / 2;
            if (check(mid, K, A)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return max;
    }
    
    private int findMax(int[] A) {
        int max = 0;
        for (int val: A) {
            if (val > max) max = val;
        }
        return max;
    }
    
    private boolean check(int largeSum, int K, int[] A) {
        int blockNum = 0;
        int blockSum = 0;
        for (int i = 0; i < A.length; i++) {
            blockSum += A[i];
            if (blockSum > largeSum) {
                blockSum = A[i];
                blockNum++;
            }
        }
        if (blockSum != 0) blockNum++;
        if (blockNum <= K) return true;
        return false;
    } 
}