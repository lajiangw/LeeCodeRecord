package com.zml;

import com.zml.bean.TreeNode;

/**
 * @author ZhangMinlei
 * @description 226. 翻转二叉树
 * @date 2023-08-30 20:45
 */
public class Solution226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        // 保存右子树
        TreeNode rightTree = root.right;
        // 交换左右子树的位置
        root.right = invertTree(root.left);
        root.left = invertTree(rightTree);
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) return null;
        invertTree2(root.left);
        TreeNode right = root.right;
        root.right = root.left;
        root.left = right;
        invertTree2(root.left);
        return root;
    }

}
