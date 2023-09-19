package com.zml;

import java.util.ArrayList;

/**
 * @author ZhangMinlei
 * @description 234. 回文链表
 * @date 2023-09-18 21:15
 */
public class Solution234 {
//    使用双指针

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        for (ListNode p = head; p != null; p = p.next) {
            list.add(p.val);
        }

        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
