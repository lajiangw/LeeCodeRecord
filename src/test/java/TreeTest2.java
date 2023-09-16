import com.zml.bean.TreeNode;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-09-16 8:02
 */
public class TreeTest2 {

    //    遍历查找
    public void BST(TreeNode root, int val) {
        if (root == null) return;
//      对val进行操作
        if (root.val > val) BST(root.left, val);
        if (root.val < val) BST(root.right, val);
    }

    //    遍历链表
    public void forListNote(TreeTest.ListNode listNode) {
        for (TreeTest.ListNode p = listNode; p != null; p = p.next) {
//            进行遍历操作
        }
    }

    public void forTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        forTree(treeNode.left);
        forTree(treeNode.right);
    }

}
