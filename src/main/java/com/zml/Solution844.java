package com.zml;

import java.util.Objects;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-18 21:06
 */
public class Solution844 {

    public static void main(String[] args) {
        Solution844 solution844 = new Solution844();
        System.out.println(solution844.backspaceCompare("ab#c", "ad#c"));

    }

    //给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
    public boolean backspaceCompare(String s, String t) {
        s = txEdit(s);
        t = txEdit(t);
        return Objects.equals(s, t);
    }

    public String txEdit(String s) {
        char[] charArray = s.toCharArray();
        int len = charArray.length;
        int slow = 0;
        for (int i = 0; i < len; i++) {
            if (charArray[i] == '#') {
                slow = slow == 0 ? 0 : slow - 1;
            } else {
                charArray[slow] = charArray[i];
                slow++;
            }
        }
        return new String(charArray, 0, slow);
    }
}
