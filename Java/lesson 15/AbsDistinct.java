// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<Integer>();
        for (int val: A) {
            if (val < 0) val *= -1;
            set.add(val);
        }
        return set.size();
    }
}