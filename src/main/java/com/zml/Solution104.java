package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-28 21:20
 */
public class Solution104 {

    //    我们知道了 左子树l和右子树r的最大深度之后，那么该二叉树最大的深度就是 max（l+r） +1
    public int maxDepth(TreeNode root) {
//        如果根节点为空，他就没有叶子节点，则最大深度就是0 这是递归的终止条件
        if (root == null) return 0;
        else {
//            递归去求左右子树的最大深度，依次赋值给l 和 r
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
//            最后求出比较大的节点深度 +1 则是 最大深度
            return Math.max(l, r) + 1;
        }

        //        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
