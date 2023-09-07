package com.zml;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangMinlei
 * @description 876. 链表的中间结点
 * @date 2023-09-07 18:52
 */

public class Solution876 {

    //  暴力破解，当链表很长时，需要很久的时间。
//    中间节点 （n /2 ）+1

    public ListNode middleNode(ListNode head) {
        int count = 1;
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null) {
            count++;
            list.add(head);
            head = head.next;
        }
        int n1 = count / 2;
//         - 1  是因为 计数是从1开始的 ，而 链表是从0开始的
        if (count % 2 == 0) return list.get(n1 - 1);
        else return list.get(n1);
    }

    /*
     *     使用快慢指针， 慢指针一次走1  快指针一次走2，当快指针走到终点时，慢指针此时指向的就是中间节点。
     *
     * */
    public ListNode middleNode2(ListNode head) {
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

}
