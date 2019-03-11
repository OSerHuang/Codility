// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N, int M) {
        // write your code in Java SE 8
        return (int)(lcm(N, M) / M);
    }
    
    private int gcd(int a, int b) {
        if (a % b == 0) return b;
        else return gcd(b, a % b);
    }
    
    private long lcm(int a, int b) {
        return a * (long)(b / gcd(a, b));
    }
}