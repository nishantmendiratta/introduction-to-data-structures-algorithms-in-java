package org.geeksforgeeks.recursion;

/**
 * Print N to 1 Using Recursion
 * 5
 * 4
 * 3
 * 2
 * 1
 */
public class printToN3 {
    static class Solution {
        void run(int n) {
            if (n==0) {
                return;
            }
            System.out.println(n);
            run(n-1);
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.run(5);
    }
}
