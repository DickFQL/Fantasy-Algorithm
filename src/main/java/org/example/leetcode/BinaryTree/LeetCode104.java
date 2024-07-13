package org.example.leetcode.BinaryTree;

public class LeetCode104 {




    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        else {
            return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Math.ceil(1.6));
        System.out.println(Math.floor(1.6));
        System.out.println(Math.exp(2));

    }
}
