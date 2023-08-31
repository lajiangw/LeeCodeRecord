package com.zml;

import com.zml.bean.TreeNode;


/**
 * @author ZhangMinlei
 * @description 101. 对称二叉树
 * @date 2023-08-22 20:06
 */
public class Solution101 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Solution101 symmetricTree = new Solution101();
        boolean isSymmetric = symmetricTree.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + isSymmetric);
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    //    我们观察树即可发现，左子树的左孩子等于右子树的右孩子，左子树的右孩子 等于右子树的右孩子 这两个树则是平衡的。
    private boolean check(TreeNode treeA, TreeNode treeB) {
        /*
         * 终止条件：
         *  1 A节点和B节点都为空
         *  2 两个节点任意为空
         *  3 两个节点的值不相等
         *
         * */
        if (treeA == null && treeB == null) return true;
        if (treeA == null || treeB == null) return false;
        if (treeA.val != treeB.val) return false;

//     递归的条件：   只有当A节点的左孩子 == B节点的右孩子 并且 A节点的右孩子 == B节点的左孩子。
        return check(treeA.left, treeB.right) && check(treeA.right, treeB.left);
    }


    private boolean check2(TreeNode q, TreeNode p) {

//         两个节点都为空 一定对称
        if (q == null && p == null) return true;
//        只有一个为空 一定不对称
        if (q == null || p == null) return false;
//        节点的值不同，一定不对称
        if (q.val != p.val) return false;
//        递归 去遍历 让 左子树的左节点和右子树的右节点 相等 并且 让左子树的右节点和右子树的左节点相等 才是对称
        return check(q.left, p.right) && check(q.right, p.left);
    }
}


