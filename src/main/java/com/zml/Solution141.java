package com.zml;

/**
 * @author ZhangMinlei
 * @description 141. 环形链表
 * @date 2023-08-29 22:16
 */
public class Solution141 {



    //    这里使用的快慢指针的问题解决。。
    public boolean hasCycle(ListNode head) {
//        fast 是兔子，  slow 是乌龟
        ListNode fast = head, slow = head.next;
        /*
         *           循环结束条件是 乌龟和兔子任意一个指向空，我们知道链表中只有最后一个节点指向空；
         *             如果，他们两个任意指向空，则说明，走到了末尾，并且末尾并没有指向其他节点 ，也就不是循环链表
         * */
        while (fast != null && fast.next != null) {
//            乌龟走一步，兔子走两步
            slow = slow.next;
            fast = fast.next.next;
//            如果是环形链表的话，我们的兔子一定会遇到乌龟，则可以进行判断来是否是环形指针
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
//        因为题目给出了范围 我们可以没遍历一个节点将值修改为 最大范围+1 的值 最多遍历n次即可
        while (head != null) {
            if (head.val == 100001) return true;
            head.val = 100001;
            head = head.next;
        }
        return false;
    }
}
