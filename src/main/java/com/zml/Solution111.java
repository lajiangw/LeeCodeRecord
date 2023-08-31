package com.zml;

import com.zml.bean.TreeNode;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-31 22:08
 */
public class Solution111 {

    public int minDepth(TreeNode root) {
//        树为空则返回0
        if (root == null) return 0;
//        若左右孩子都为空 则返回 1
        if (root.left == null && root.right == null) return 1;
//        求出左右孩子树的深度
        int r = minDepth(root.right);
        int l = minDepth(root.left);
//        若左右孩子任意为空，则返回 不为空的深度+1；  返回l + r 是因为  r 和 l 肯定有一个是空的，所以可以相加返回
        if (root.right == null || root.left == null) return r + l + 1;
//         若左右孩子都不为空，则直接返回 较小深度的孩子即可
        return Math.min(r, l) + 1;
    }

//    改良版
    public int minDepth2(TreeNode root) {
        if (root == null) return 0;
        int m1 = minDepth2(root.right);
        int m2 = minDepth2(root.left);
        return root.left == null || root.right == null ? m1 + m2 + 1 : Math.min(m1, m2) + 1;
    }


}
