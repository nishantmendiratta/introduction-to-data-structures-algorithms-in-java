package org.takeuforward.arrays2;

// https://leetcode.com/problems/rotate-image/
public class RotateImage {
    static class Solution {
        public void rotate(int[][] matrix) {
            // transpose matrix
            /*
             * {
             * {1,4,7},
             * {2,5,8},
             * {3,6,9}
             * }
             */
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i; j < matrix[0].length; j++) {
                    int temp = 0;
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            System.out.println("Transpose of the matrix");
            print(matrix);
            // reverse rows
            /*
             * {{7,4,1},
             * {8,5,2},
             * {9,6,3}}
             **/
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    int temp = 0;
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length - 1 - j];
                    matrix[i][matrix.length - 1 - j] = temp;
                }
            }
            System.out.println("Solution:");
            print(matrix);
        }
    }

    public static void print(int[][] matrix) {
        for (int row=0; row<matrix.length; row++) {
            for (int col=0; col<matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        print(matrix);
        sl.rotate(matrix);
    }
}
