package org.geeksforgeeks.recursion;

/**
 * 3
 * 2
 * 1
 * 1
 * 2
 * 3
 */
public class Practice1 {
    static class Solution {
        void run(int n) {
            if (n == 0) {
                return;
            }
            System.out.println(n);
            run(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.run(3);
    }
}
