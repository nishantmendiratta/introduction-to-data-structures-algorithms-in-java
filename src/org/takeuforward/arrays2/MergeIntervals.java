package org.takeuforward.arrays2;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/merge-intervals/submissions/1159518395/
public class MergeIntervals {
    static class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            ArrayList<int[]> result = new ArrayList<>();
            for (int i=0; i<intervals.length;i++) {
                if (i+1 < intervals.length && intervals[i+1][0]<=intervals[i][1]) {
                    intervals[i+1][0] = Math.min(intervals[i][0], intervals[i+1][0]);
                    intervals[i+1][1] = Math.max(intervals[i+1][1], intervals[i+1][1]);
                } else {
                    result.add(intervals[i]);
                }
            }
            int[][] requestedOutput = new int[result.size()][2];
            for (int i=0; i<result.size(); i++) {
                requestedOutput[i] = result.get(i);
            }
            return requestedOutput;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
//        int[][] intervals = {
//                {1,3},
//                {2,6},
//                {8,10},
//                {15,18}
//        };
        int[][] intervals = {
                {1,4},
                {0,4},
        };
        int[][] result = sl.merge(intervals);
        for (int i=0;i<result.length;i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
