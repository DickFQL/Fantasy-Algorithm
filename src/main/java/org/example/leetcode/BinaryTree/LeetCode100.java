package org.example.leetcode.BinaryTree;

public class LeetCode100 {
    Integer[] cnt1 = new Integer[10001];
    void layer(TreeNode treeNode,int i){
        if (treeNode == null){
            cnt1[i] = null;
        }
        layer(treeNode.left,i+1);
        layer(treeNode.right,i+1);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null &&q!=null ||p!=null &&q==null) return false;
        if (p==null && q == null ) return true;
        if (isSameTree(p.left,q.left) && isSameTree(p.right,q.right) &&p.val==q.val) return true;
        return false;

    }

}
