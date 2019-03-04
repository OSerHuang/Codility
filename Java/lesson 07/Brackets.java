// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> left = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                left.push(c);
            } else {
                if (left.empty()) return 0;
                switch (left.pop()) {
                    case '{': if (c != '}') return 0; break;
                    case '(': if (c != ')') return 0; break;
                    case '[': if (c != ']') return 0; break;
                }
            }
        }
        if (left.empty()) return 1;
        return 0;
    }
}