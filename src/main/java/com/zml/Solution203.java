package com.zml;

import java.util.List;

/**
 * @author ZhangMinlei
 * @description 203. 移除链表元素
 * @date 2023-09-12 19:56
 */
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
//         第一个循环的作用是删除链表头部所有值等于给定值 val 的节点。
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }

        ListNode listNode = head;
        while (listNode.next != null) {
//            经过第一次循环的判断，就不需要担心头结点相等，直接对下个节点进行判断。
            if (listNode.next.val == val) {
                listNode.next = listNode.next.next;
            } else {
                listNode = listNode.next;
            }
        }
        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {
// 使用迭代
        ListNode listNode = new ListNode(val - 1);
        listNode.next = head;
        ListNode prev = listNode;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return listNode.next;
    }

    //    递归
    public ListNode removeElements3(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements3(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

}
