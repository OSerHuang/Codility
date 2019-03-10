// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] result = new int[P.length];
        int[] prefixCount = simeprimePrefixCount(N);
        for (int i = 0; i < P.length; i++) {
            result[i] = prefixCount[Q[i]] - prefixCount[P[i] - 1];
        }
        return result;
    }
    
    private int[] primes(int n) {
        int[] isPrime = new int[n + 1];
        for (int i = 2; i < n + 1; i++) isPrime[i] = 1;
        int i = 2;
        while (i * i <= n) {
            if (isPrime[i] == 1) {
                int j = i * i;
                while (j <= n) {
                    isPrime[j] = 0;
                    j += i;
                }
            }
            i++;
        }
        return isPrime;
    }
    
    private int[] simeprimePrefixCount(int N) {
        int[] isPrime = primes(N / 2);
        int[] prefixCount = new int[N + 1];
        for (int i = 0; i < isPrime.length && i * i <= N; i++) {
            if (isPrime[i] == 1) {
                for (int j = i; j < isPrime.length && i * j <= N; j++) {
                    if (isPrime[j] == 1) prefixCount[i * j] = 1;
                }
            }
        }
        for (int i = 5; i < prefixCount.length; i++) {
            prefixCount[i] += prefixCount[i - 1];
        }
        return prefixCount;
    }
}