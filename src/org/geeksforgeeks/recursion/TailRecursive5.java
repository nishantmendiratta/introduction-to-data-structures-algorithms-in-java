package org.geeksforgeeks.recursion;

/**
 * 10
 * 9
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 */
public class TailRecursive5 {
    static void func(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n+ " ");
        func(n-1);
    }

    public static void main(String[] args) {
        func(10);
    }
}
