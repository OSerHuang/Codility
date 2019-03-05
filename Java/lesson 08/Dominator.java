// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<Integer>();
        for (int val: A) {
            if (stack.empty() || stack.peek() == val) {
                stack.push(val);
            } else {
                stack.pop();
            }
        }
        if (stack.empty()) return -1;
        int dominator = stack.pop();
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == dominator) counter++;
            if (counter * 2 > A.length) return i;
        }
        return -1;
    }
}