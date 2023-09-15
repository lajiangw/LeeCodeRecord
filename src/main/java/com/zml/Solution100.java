package com.zml;

import com.zml.bean.TreeNode;
import org.jetbrains.annotations.TestOnly;

/**
 * @author ZhangMinlei
 * @description 100. 相同的树
 * @date 2023-09-15 15:05
 */
public class Solution100 {
//    https://leetcode.cn/problems/same-tree/solutions/6558/xie-shu-suan-fa-de-tao-lu-kuang-jia-by-wei-lai-bu-/
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(q.right, p.right)
                && isSameTree(q.left, p.left);
    }

    private void treeTest(TreeNode root) {
        if (root == null) return;
        root.val += 1;
        treeTest(root.left);
        treeTest(root.right);
    }


}