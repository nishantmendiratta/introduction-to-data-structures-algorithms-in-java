package org.takeuforward.arrays1;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/
public class SortColors {
    static class Solution {
        public void sortColors(int[] nums) {
            int onesCount = 0, zerosCount = 0;
            for (int i=0; i<nums.length; i++) {
                if (nums[i] == 0) {
                    zerosCount++;
                } else if (nums[i] == 1) {
                    onesCount++;
                }
            }

            for (int i=0; i<nums.length; i++) {
                if (i<zerosCount) {
                    nums[i] = 0;
                } else if (i < zerosCount + onesCount) {
                    nums[i] = 1;
                } else {
                    nums[i] = 2;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = {2,0,2,1,1,0}; // [0,0,1,1,2,2]
        sl.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
