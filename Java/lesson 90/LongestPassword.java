// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int res = -1;
        String[] words = S.split(" ");
        for (String word: words) {
            int letterCount = 0, digitCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (0x30 <= c && c <= 0x39) {
                    digitCount++;
                } else if ((0x41 <= c && c <= 0x5A) || (0x61 <= c && c <= 0x7A)) {
                    letterCount++;
                } else {
                    break;
                }
            }
            if (letterCount + digitCount == word.length() && letterCount % 2 == 0 && digitCount % 2 == 1) {
                if (res < word.length()) res = word.length();
            }
        }
        return res;
    }
}