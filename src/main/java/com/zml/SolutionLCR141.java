package com.zml;

import java.util.ArrayList;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-09-21 14:19
 */
public class SolutionLCR141 {
    public ListNode trainningPlan(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode temp = cur.next; //暂存后继节点 cur.next
            cur.next = pre;     //修改next指向
            pre = cur;          //pre 暂存 cur
            cur = temp;         //cur 访问下一节点
        }
        return pre;
    }
}
