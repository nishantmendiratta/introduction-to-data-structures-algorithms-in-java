package org.geeksforgeeks.recursion;

// Sum of Digits Using Recursion
public class SumDigits9 {
    static int sumDigits(int n) {
        if (n<10) {
            return n;
        }
        return n%10 + sumDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(111));
    }
}
