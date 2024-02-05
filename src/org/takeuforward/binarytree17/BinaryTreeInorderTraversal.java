package org.takeuforward.binarytree17;

import java.util.*;

public class BinaryTreeInorderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {};
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static class Solution {
        void dfs(TreeNode root, List<Integer> result) {
            if (root == null) return;

            dfs(root.left, result);
            result.add(root.val);
            dfs(root.right, result);
        }
        public List<Integer> inorderTraversalRecursive(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            dfs(root, result);
            return result;
        }
        public List<Integer> inorderTraversalIterative(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> st = new Stack<>();
            while (true) {
                if (root!=null) {
                    st.push(root);
                    root = root.left;
                } else {
                    if (st.empty()) break;

                    root = st.peek();
                    st.pop();
                    result.add(root.val);
                    root = root.right;
                }
            }
            return result;
        }
        // Iterative 2
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> st = new Stack<>();
            while (root != null || !st.empty()) {
                while (root  != null) {
                    st.push(root);
                    root = root.left;
                }
                root = st.peek();
                st.pop();
                result.add(root.val);
                root = root.right;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> result = sl.inorderTraversal(root);
        for (int num: result) {
            System.out.println(num);
        }
    }
}
