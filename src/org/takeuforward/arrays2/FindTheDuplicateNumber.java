package org.takeuforward.arrays2;

import java.util.Arrays;

// https://leetcode.com/problems/find-the-duplicate-number/
public class FindTheDuplicateNumber {
    static class Solution {
        public int findDuplicate(int[] nums) {
            Arrays.sort(nums);
            int result = -1;
            for (int i=0; i<nums.length; i++) {
                if (i+1<nums.length && nums[i+1] == nums[i]) {
                    result = nums[i];
                    break;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = {1,3,4,2,2}; // 2
        int result = sl.findDuplicate(nums);
        System.out.println(result);
    }
}
