package com.zml;

import com.zml.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangMinlei
 * @description 94 中序遍历二叉树
 * @date 2023-09-03 19:26
 */
public class Solution94 {
//    中序遍历，访问 左子树-根节点-右子树 的方式是 中序遍历
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        new Solution94().inorderTraversal(root);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
//        使用递归
        ArrayList<Integer> list = new ArrayList<>();
        indor(root, list);
        return list;
    }

    public void indor(TreeNode node, List<Integer> res) {
        if (node == null) return;
        indor(node.left, res);
        res.add(node.val);
        indor(node.right, res);
    }
}
