package org.takeuforward.arrays3;

import java.util.*;

// https://leetcode.com/problems/majority-element/
public class MajorityElement {
    static class Solution {
        public int majorityElement(int[] nums) {
            int result = -1;
            Map<Integer, Integer> hm = new HashMap<>();
            for (int i=0; i<nums.length; i++) {
                if (hm.containsKey(nums[i])) {
                    hm.put(nums[i], hm.get(nums[i])+1);
                } else {
                    hm.put(nums[i], 1);
                }
            }

            for (int key: hm.keySet()) {
                if (hm.get(key) > (nums.length)/2) {
                    result = key;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = {3,2,3}; // 3
        int result = sl.majorityElement(nums);
        System.out.println(result);
    }
}
