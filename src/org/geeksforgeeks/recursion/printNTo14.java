package org.geeksforgeeks.recursion;

/**
 * Print 1 to N Using Recursion
 * 1
 * 2
 * 3
 * 4
 * 5
 */
public class printNTo14 {
    static class Solution {
        void run(int n) {
            if (n==0) {
                return;
            }
            run(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.run(5);
    }
}
