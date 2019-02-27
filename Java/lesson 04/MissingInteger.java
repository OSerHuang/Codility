// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] map = new int[A.length + 1];
        for (int val: A) {
            if (val > 0 && val <= A.length + 1) {
                map[val - 1] = 1;
            }
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 0) return i + 1;
        }
        return -1;
    }
}