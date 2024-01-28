package org.takeuforward.arrays3;

// https://leetcode.com/problems/powx-n/submissions/1159558098/
public class PowXN {
    static class Solution {
        public double myPow(double x, int n) {
            double result = 1.0;
            long nn = n;

            if (nn<0) nn = -1 * nn;

            while(nn>0) {
                if (nn%2==0) {
                    x = x*x;
                    nn = nn/2;
                } else {
                    result = result*x;
                    nn = nn-1;
                }
            }
            System.out.println("result " + result);
            if (n<0) {
                result = (double)(1.0)/(double)(result);
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Solution sl = new Solution();
//        double x = 2.00000;
//        int n = 10;
        double x = 2.00000;
        int n = -2147483648;
        double result = sl.myPow(x, n);
        System.out.println(result);

    }
}
