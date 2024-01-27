package org.takeuforward.arrays1;

class SetMatrixZeroes {
    static class Solution {
        public void setZeroes(int[][] matrix) {
            int col0 = 1;
            for(int i=0;i<matrix.length; i++) {
                for(int j=0; j<matrix[i].length; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        if (j!=0) {
                            matrix[0][j] = 0;
                        } else {
                            col0 = 0;
                        }
                    }
                }
            }

            for(int row=1; row<matrix.length;row++) {
                for(int col=1; col<matrix[row].length; col++) {
                    if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                        matrix[row][col] = 0;
                    }
                }
            }

            if (matrix[0][0] == 0) {
                for(int col=1; col<matrix[0].length; col++) {
                    matrix[0][col] = 0;
                }
            }

            if (col0==1) {
                for(int row=0; row<matrix.length; row++) {
                    matrix[row][0] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("HI");
        Solution sl = new Solution();

        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };

        sl.setZeroes(matrix);
    }
}