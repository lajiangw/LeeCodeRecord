package com.zml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZhangMinlei
 * @description 83. 删除排序链表中的重复元素
 * @date 2023-09-05 16:10
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
//        当 指针指向的节点为空并且写一个节点为空 则退出
        while (cur != null && cur.next != null) {
//            判断此节点和下个节点是否值是否相同
            if (cur.val == cur.next.val) {
//                相同则将当前节点的下个指向下下个节点
                cur.next = cur.next.next;
            } else {
//                否则 正常迭代
                cur = cur.next;
            }
        }
        return head;
    }
}
