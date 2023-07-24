package com.zml;

import java.util.Arrays;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-07-23 21:54
 */
public class Solution {
    /**
     * 20 有效的括号
     * replace 方法会将字符串内所有的预期值替换为相对应值，
     * 使用一半的数组长度是因为不需要全部都去遍历，只需要遍历一半就可以，因为每次替换的值是两个。
     * 如果全部匹配 s 数组的长度肯定为0； 反之亦然。
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s.replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        }
        return s.length() == 0;
    }



}
