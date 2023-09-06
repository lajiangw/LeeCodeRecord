package com.zml;

/**
 * @author ZhangMinlei
 * @description 160. 相交链表
 * @date 2023-09-06 12:44
 */
public class Solution160 {
    //  题解链接：  https://leetcode.cn/problems/intersection-of-two-linked-lists/solutions/10774/tu-jie-xiang-jiao-lian-biao-by-user7208t/

// 同时让pa和pb 便利 a链表和b链表，他们的路程和速度都是相等的，如果有交点，肯定会在交点相遇，指向同一节点，
//    如果没有相遇，则最后都会指向链表的最后，也就是null

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
//            遍历 如果 pA 走到尽头了，就去便利pB链表
            pA = pA == null ? headB : pA.next;
//            如果 pB 走到尽头了，就去便利pA链表
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
