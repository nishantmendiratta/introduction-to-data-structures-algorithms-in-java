package org.takeuforward.arrays2;

import java.util.*;

// https://leetcode.com/problems/merge-sorted-array/submissions/1159536336/
public class MergeSortedArray {
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p1 = m-1;
            int p2 = n-1;
            for (int p=m+n-1; p>=0; p--) {
                if (p2<0) {
                    break;
                }
                if (p1>=0 && nums1[p1] > nums2[p2]) {
                    nums1[p] = nums1[p1--];
                } else {
                    nums1[p] = nums2[p2--];
                }
            }
        }
        public void mergeBruteForce(int[] nums1, int m, int[] nums2, int n) {
            for(int i=0; i<n;i++) {
                nums1[i+m] = nums2[i];
            }
            Arrays.sort(nums1);
        }
        public void mergeBruteForce2(int[] nums1, int m, int[] nums2, int n) {
            int left = 0;
            int right = 0;
            ArrayList<Integer> result = new ArrayList<>();

            while (left < m && right<n) {
                if (nums1[left] < nums2[right]) {
                    result.add(nums1[left++]);
                } else {
                    result.add(nums2[right++]);
                }
            }

            while (left<m) {
                result.add(nums1[left++]);
            }
            while (right<n) {
                result.add(nums2[right++]);
            }
            int i=0;
            for (int it: result) {
                nums1[i] = it;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        sl.merge(nums1, m, nums2, n);
    }
}
