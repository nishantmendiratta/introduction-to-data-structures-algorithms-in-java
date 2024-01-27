package org.takeuforward.arrays1;
import java.util.*;


public class PascalsTriangle {
    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            for(int row=0;row<numRows; row++) {
                List<Integer> tempList = new ArrayList<>();
                for(int col=0;col<=row;col++) {
                    if (col==0 || col==row) {
                        tempList.add(col, 1);
                    } else {
                        int element = result.get(row-1).get(col) + result.get(row-1).get(col-1);
                        tempList.add(col, element);
                    }
                }
                result.add(tempList);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int n = 5;
        List<List<Integer>> result = sl.generate(n);
        for(int i=0;i<result.size(); i++) {
            List<Integer> row = result.get(i);
            for(int j=0; j<row.size(); j++) {
                System.out.print(row.get(j));
            }
            System.out.println();
        }
    }
}
