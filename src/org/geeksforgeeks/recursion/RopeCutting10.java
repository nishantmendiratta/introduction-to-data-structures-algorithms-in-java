package org.geeksforgeeks.recursion;

public class RopeCutting10 {
    static int maxCuts(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        int result = Math.max(
                maxCuts(n - a, a, b, c),
                Math.max(
                        maxCuts(n - b, a, b, c),
                        maxCuts(n - c, a, b, c)
                )
        );
        if (result == -1) {
            return -1;
        }

        return result + 1;
    }

    public static void main(String[] args) {
        // int n = 5, a = 2, b = 1, c = 5; // 5
        int n = 9, a = 2, b = 2, c = 2; // corner case
        System.out.println(maxCuts(n, a, b, c));
    }
}
