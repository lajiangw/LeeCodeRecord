package com.zml;

/**
 * @author ZhangMinlei
 * @description 21. 合并两个有序链表
 * @date 2023-08-23 21:37
 */
public class Solution21 {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode result1 = mergeTwoLists(list1, list2);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
//当 l1 的节点小于 l2 的节点 ，则将l1 的下个节点与当前 l2 节点进行比较，
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            //当 l2 的节点小于 l1 的节点 ，则将l1 的下个节点与当前 l1 节点进行比较，
//            通过不断递归最后返回已经合并好的链表
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}


