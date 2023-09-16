package com;

import com.zml.bean.TreeNode;

/**
 * @author ZhangMinlei
 * @description 112. 路径总和
 * @date 2023-09-16 9:18
 */
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

//        判断当前是否是叶子节点，叶子节点没有左右子树
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
//        每次递归调用都会将sum - 节点val ，来找到正确路径
        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }
}
