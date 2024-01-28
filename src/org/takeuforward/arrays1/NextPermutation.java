package org.takeuforward.arrays1;

import java.util.*;

//https://leetcode.com/problems/next-permutation/submissions/1159266155/
public class NextPermutation {
    static class Solution {
        public void swap(int nums[], int l, int i) {
            int temp = nums[l];
            nums[l] = nums[i];
            nums[i] = temp;
        }

        public void generatePermutations(int[] nums, ArrayList<int[]> permutations, int index) {
            if (index == nums.length) {
                permutations.add(Arrays.copyOf(nums, nums.length));
                return;
            }
            for (int i = index; i < nums.length; i++) {
                swap(nums, i, index);
                generatePermutations(nums, permutations, index + 1);
                swap(nums, i, index);
            }
        }

        int arrayToInt(int[] arr) {
            StringBuilder s = new StringBuilder();

            for (int i : arr) {
                s.append(i);
            }

            return Integer.parseInt(s.toString());
        }

        public void nextPermutationBruteForce(int[] nums) {
            ArrayList<int[]> permutations = new ArrayList<>();

            int[] numsCopy = new int[nums.length];
            numsCopy = Arrays.copyOf(nums, nums.length);
            Arrays.sort(numsCopy);

            generatePermutations(numsCopy, permutations, 0);

            Collections.sort(permutations, new Comparator<int[]>() {
                public int compare(int[] o1, int[] o2) {
                    return arrayToInt(o1) - arrayToInt(o2);
                }
            });

            int next = -1;
            for (int i = 0; i < permutations.size(); i++) {
                int[] row = permutations.get(i);
                if (arrayToInt(row) == arrayToInt(nums)) {
                    next = i + 1;
                    if (next > permutations.size() - 1) {
                        next = 0;
                    }
                }
            }

            for (int i = 0; i < permutations.get(next).length; i++) {
                System.out.print(permutations.get(next)[i]);
                nums[i] = permutations.get(next)[i];
            }
        }

        // TODO: optimized solution
        public void nextPermutation(int[] nums) {
            // Step 1: Longer prefix match (nums[i]>nums[i-1])
            // Step 2: Find greatest i but smaller eg smallest= Min.(arr[index+1],....upto.., arr[arr.length]]). So that you stay close to the current permutation
              // Swap(nums[i], nums[smallest]
            // Step 3: Place arr[index+1],..upto,..arr[arr.length-1] in a sorted order

            int index = -1;
            for (int i=nums.length-2; i>=0; i--) {
                if (nums[i]<nums[i+1]) {
                    index = i;
                    break;
                }
            }
            if (index==-1) {
                // Reverse nums
                int start = 0, end = nums.length-1 ;
                while(start < end)
                {
                    swap(nums, start++, end--);
                }
            } else {
                for (int i=nums.length-1; i>index; i--) {
                    if (nums[i]>nums[index]) {
                        swap(nums, i, index);
                        break;
                    }
                }
                Arrays.sort(nums, index+1, nums.length);
                System.out.print(Arrays.toString(nums));
            }
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        // int[] nums = {1,2,3}; // 1,3,2
        // int[] nums = {3,2,1}; // 1,2,3
        int[] nums = {1, 1, 5}; // 1,5,1
        // sl.nextPermutationBruteForce(nums); // Time Limit Exceeded O(N! * (N))
        sl.nextPermutation(nums); // O(N)
    }
}
