package com.zml;

import com.zml.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZhangMinlei
 * @description 144. 二叉树的前序遍历
 * @date 2023-09-09 19:45
 */
public class Solution144 {
    //  题解链接：  https://leetcode.cn/problems/binary-tree-preorder-traversal/solutions/87526/leetcodesuan-fa-xiu-lian-dong-hua-yan-shi-xbian-2/
    //    前序遍历：根结点 -> 左子树-> 右子树
    ArrayList<Integer> list = new ArrayList<>();

    //    使用递归解决，我们不需要去关注栈堆问题，我们只需要关注我们需要计算机为什么做什么即可。
//    熟悉理解递归，想清楚想做什么，什么时候接触即可。
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null) return null;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
//        中序遍历：左子树-> 根结点-> 右子树
        if (root == null) return new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        test(root, list1);
        return list1;
    }

    private void test(TreeNode treeNode, List<Integer> list) {
        if (treeNode != null) {
            return;
        }
        test(treeNode.left, list);
        list.add(treeNode.val);
        test(treeNode.right, list);
    }


}
