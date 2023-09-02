package com.zml;

import java.util.ArrayList;

/**
 * @author ZhangMinlei
 * @description 剑指 Offer 06. 从尾到头打印链表
 * @date 2023-09-02 18:58
 */
public class Solutionjz06 {
    public int[] reversePrint(ListNode head) {
//        因为链表的长度不确定，所以使用list。
        ArrayList<Integer> list = new ArrayList<>();
//        取出链表中的每个值，给到list
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
//        因为返回值是 int 数组 我们创建 list大小的数组。
        int[] arr = new int[list.size()];
        int j = list.size() - 1;
//        遍历赋值
        for (int i : list) {
            arr[j--] = i;
        }
        return arr;
    }

    public int[] reversePrint2(ListNode head) {
        ListNode node = head;
//        count 记录节点， 作为数组的大小
        int count = 0;
        while (node != null) {
            ++count;
            node = node.next;
        }

        int[] arr = new int[count];
//        重新遍历head链表
        node = head;

//        倒序赋值，实现数组反向
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = node.val;
            node = node.next;
        }
//        最后将node指向空
        node = null;
//       gc 进行垃圾回收
        System.gc();
        return arr;
    }

}
