package org.geeksforgeeks.recursion;

// Palindrome Check using Recursion
public class IsPalindrome8 {
    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        return str.charAt(start) == str.charAt(end) && isPalindrome(str, start+1, end-1);
    }

    public static void main(String[] args) {
        String s = "GeekskeeG";
        if (isPalindrome(s, 0, s.length()-1)) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is NOT a Palindrome");
        }
    }
}
