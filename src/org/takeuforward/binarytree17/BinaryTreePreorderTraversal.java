package org.takeuforward.binarytree17;

import com.sun.source.tree.Tree;

import javax.swing.text.html.ListView;
import java.util.*;

public class BinaryTreePreorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this. right = right;
        }
    }
    static class Solution {
        void dfs (List<Integer> result, TreeNode root) {
            if (root == null) {
                return;
            }
            result.add(root.val);
            dfs(result, root.left);
            dfs(result, root.right);
        }
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            dfs(result, root);
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        sl.preorderTraversal(root);
    }

}
