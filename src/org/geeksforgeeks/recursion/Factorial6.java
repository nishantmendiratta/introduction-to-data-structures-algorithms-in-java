package org.geeksforgeeks.recursion;

public class Factorial6 {
    // Not Tail recursive
    static int fact(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        return n * fact(n-1);
    }
    // Tail recursive
    /* static int fact(int n, int k) {
        if (n==0 || n==1) {
            return k;
        }
        return fact(n-1, k*n);
    }*/
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
