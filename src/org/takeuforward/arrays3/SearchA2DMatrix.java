package org.takeuforward.arrays3;

// https://leetcode.com/problems/search-a-2d-matrix/
public class SearchA2DMatrix {
    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            if (m == 0)
                return false;
            int n = matrix[0].length;
            int start = 0;
            int end = m * n - 1;
            while (start <= end) {
                int pivotIdx = (end + start) / 2;
                int pivotElement = matrix[pivotIdx / n][pivotIdx % n];
                if (pivotElement == target) {
                    return true;
                } else {
                    if (pivotElement < target) {
                        start = pivotIdx + 1;
                    } else {
                        end = pivotIdx - 1;
                    }
                }
            }
            return false;
        }
        public boolean searchMatrixBruteForce(int[][] matrix, int target) {
            boolean result = false;
            int foundRow =-1;
            for (int row=matrix.length-1; row>=0; row--) {
                for (int col=0; col<matrix[row].length; col++) {
                    if (matrix[row][col] >= target) {
                        foundRow = row;
                        break;
                    }
                }
            }
            if (foundRow==-1) {
                return false;
            }
            for (int col=0;col<matrix[foundRow].length;col++) {
                if (matrix[foundRow][col] == target) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 3;
        boolean result = sl.searchMatrix(matrix, target);
        if (result) {
            System.out.println("Found!");
        } else {
            System.out.println("Not Found!");
        }
    }
}
