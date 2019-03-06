// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int profit = 0;
        int buy_price = Integer.MAX_VALUE;
        for (int price: A) {
            buy_price = Math.min(price, buy_price);
            profit = Math.max(profit, price - buy_price);
        }
        return profit;
    }
} 