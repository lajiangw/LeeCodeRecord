package com.zml;

import com.zml.bean.TreeNode;

/**
 * @author ZhangMinlei
 * @description 700. 二叉搜索树中的搜索
 * @date 2023-09-15 17:25
 */
public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) {
            return root;
        }
        if (root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

    //    遍历BST框架
    private void BST(TreeNode root, int val) {
        if (root == null) return;
        if (root.val == val) {
//            对查找的val进行操作。
        }

        if (root.val > val) BST(root.left, val);
        if (root.val < val) BST(root.right, val);
    }

}
