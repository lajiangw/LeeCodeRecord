package com.zml;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangMinlei
 * @description 剑指 Offer 22. 链表中倒数第k个节点
 * @date 2023-09-08 13:54
 */
public class Solutionjz22 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());
    }

    //    传统方法 使用List数组可以快速访问访问的特性。
    public ListNode getKthFromEnd(ListNode head, int k) {
        ArrayList<ListNode> listNodes = new ArrayList<>();
        while (head != null) {
            listNodes.add(head);
            head = head.next;
        }
        return listNodes.get(listNodes.size() - k);
    }

    /*
     * 快慢指针
     * 首先让快指针走 k步，然后再让 快慢指针一起走，当快指针走到头时，此时慢指针指向的就是目标值。
     * */
    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode slow = head, fast = head;
        int count = 0;
        while (fast != null) {
            if (count >= k)
                slow = slow.next;
            fast = fast.next;
            count++;
        }
        return slow;
    }
}
