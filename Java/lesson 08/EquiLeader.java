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
        if (stack.empty()) return 0;
        int leader = stack.pop();
        int total_num = 0;
        for (int val: A) {
            if (val == leader) total_num++;
        }
        if (total_num * 2 <= A.length) return 0;
        
        int left_num = 0;
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) left_num++;
            if (left_num * 2 > i + 1 && (total_num - left_num) * 2 > A.length - i - 1) result++;
        }
        return result;
    }
}