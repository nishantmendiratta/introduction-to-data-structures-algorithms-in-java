package org.geeksforgeeks.recursion;

/**
 * 1
 * 1
 * 1
 * The function returns binary equivalent
 */
public class Practice2 {
    static class Solution {
        void run(int n) {
            if (n==0) {
                return;
            }
            run(n/2);
            System.out.println(n%2);
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.run(7);
    }
}
