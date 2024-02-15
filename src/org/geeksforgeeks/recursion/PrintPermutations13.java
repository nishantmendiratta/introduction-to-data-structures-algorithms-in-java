package org.geeksforgeeks.recursion;

public class PrintPermutations13 {
    static String swap(String s, int i, int j) {
        char[] sArr = s.toCharArray();
        char temp = sArr[i];
        sArr[i] = sArr[j];
        sArr[j] = temp;
        return String.valueOf(sArr);
    }

    static void permute(String str, int i) {
        if (i == str.length()-1) {
            System.out.println(str);
            return;
        }
        for (int index = i; index < str.length(); index++) {
            str = swap(str, index, i);
            permute(str, i+1);
            str = swap(str, index, i);
        }

    }

    public static void main(String[] args) {
        permute("ABC", 0);
    }
}
