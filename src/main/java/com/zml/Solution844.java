package com.zml;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-18 21:06
 */
public class Solution844 {

    public static void main(String[] args) {
        Solution844 solution844 = new Solution844();

        String s1 = "ab##c#";
        String s2 = "ad##c#";

        System.out.println(solution844.backspaceCompare(s1, s2));

    }

    //给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
    public boolean backspaceCompare(String s, String t) {
        if (s.isEmpty() && t.isEmpty()) {
            return true;
        }
        s = txEdit(s);
        t = txEdit(t);
        return Objects.equals(s, t);
    }

    //    使用两个指针，slow 代表编辑器中的下标，遇到退格则－1 不是退格的话则会将值覆盖。
    public String txEdit(@NotNull String s) {
        char[] charArray = s.toCharArray();
        int len = charArray.length;
        int slow = 0;
        for (int i = 0; i < len; i++) {
//             slow代表在文本编辑器的下标，遇到退格则 -1 ，然后此次循环结束 i++
            if (charArray[i] == '#') {
                slow = slow == 0 ? 0 : slow - 1;
            } else {
//                如果不是退格则将i下标的值赋值给slow，如果之前遇到退格，则会吧退格需要删除的值删覆盖掉。
                charArray[slow] = charArray[i];
                slow++;
            }
        }
        return new String(charArray, 0, slow);
    }
}
