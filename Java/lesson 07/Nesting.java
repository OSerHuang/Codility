// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int left_counter = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                left_counter++;
            } else {
                left_counter--;
                if (left_counter < 0) return 0;
            }
        }
        if (left_counter == 0) return 1;
        return 0;
    }
}