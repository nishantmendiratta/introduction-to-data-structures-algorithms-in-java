package org.takeuforward.arrays1;

public class MaximumSubarray {
    static class Solution {
        public int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int maxSoFar = 0;
            if (nums.length == 1) {
                return nums[0];
            }
            for (int i=0; i<nums.length; i++) {
                maxSoFar += nums[i];
                maxSum = Math.max(maxSum, maxSoFar);
                if (maxSoFar<0) {
                    maxSoFar = 0;
                }
            }
            return maxSum;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; //6 [4,-1,2,1]
        int result = sl.maxSubArray(nums);
        System.out.println("RESULT: " + result);
    }
}
