import com.zml.bean.TreeNode;
import org.junit.Test;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-09-15 15:27
 */
public class TreeTest {


    public void treeTest(TreeNode root) {
//   遍历二叉树
//        前序位置
        treeTest(root.left);
//        中序位置
        treeTest(root.right);
//        后序位置
    }

    //    递归遍历链表
    public void listTest(ListNode listNode) {
//        操作链表
        listTest(listNode.next);
//        循环遍历
        for (ListNode p = listNode; p != null; p = p.next) {
//            操作链表
        }

    }


    class ListNode {
        int val;
        ListNode next;
    }
}
