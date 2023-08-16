package com.zml;

/**
 * @author ZhangMinlei
 * @description 206 反转链表
 * @date 2023-08-16 22:10
 */
public class Solution206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reverseList2(head);
    }

    //
    public static ListNode reverseList(ListNode head) {
//        表示上一个节点
        ListNode prev = null;
//       当前处理的节点
        ListNode curr = head;
        while (curr != null) {
//            将下一个节点暂存到next
            ListNode next = curr.next;
//            将当前处理的节点的下一个链表 给到 prev
//            先把当前节点的next指向 上一节点 进行翻转
            curr.next = prev;
//              把处理完的节点 给到上一个节点
            prev = curr;
//            将暂存的下一个节点 给到curr
            curr = next;
        }
        return prev;
    }

    public static ListNode reverseList2(ListNode head) {
        ListNode p = null;
        ListNode c = head;
        while (c != null) {
            ListNode t = c.next;
            c.next = p;
            p = c;
            c = t;
        }
        return p;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

