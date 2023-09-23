package com.zml;

import com.zml.bean.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangMinlei
 * @description 145. 二叉树的后序遍历
 * @date 2023-09-23 15:44
 */
public class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        forTree(root, res);
        return res;
    }

    private void forTree(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        forTree(root.left, res);
        forTree(root.right, res);
//        后序遍历，我们在遍历完左右之后，再去添加最后的节点。
        res.add(root.val);
    }
}
