// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] result = new int[P.length];
        int[][] counter = new int[4][S.length() + 1];
        for (int i = 0; i < S.length(); i++) {
            int impact = impactAt(S, i);
            counter[impact - 1][i + 1] = counter[impact - 1][i] + 1;
            for (int j = 0; j < 4; j++) {
                if (j + 1 != impact) counter[j][i + 1] = counter[j][i];
            }
        }
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (counter[j][Q[i] + 1] > counter[j][P[i]]) {
                    result[i] = j + 1;
                    break;
                }
            }
        }
        return result;
    }
    
    private int impactAt(String S, int index) {
        switch (S.charAt(index)) {
                case 'A': return 1;
                case 'C': return 2;
                case 'G': return 3;
                case 'T': return 4;
        }
        return 0;
    }
}