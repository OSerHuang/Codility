// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        int result = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        while (i < H.length) {
            if (stack.empty() || stack.peek() < H[i]) {
                stack.push(H[i++]);
            } else if (stack.peek() == H[i]) {
                i++;
            } else {
                stack.pop();
                result++;
            }
        }
        while (!stack.empty()) {
            result++;
            stack.pop();
        }
        return result;
    }
}