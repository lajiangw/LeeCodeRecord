package com.zml;

import java.util.HashSet;

/**
 * @author ZhangMinlei
 * @description 面试题 01.01. 判定字符是否唯一
 * @date 2023-08-17 21:30
 */
public class Solution0101 {

    public boolean isUnique(String astr) {
        if (astr == null) return true;

        char[] arr = new char[26];
        char[] charArray = astr.toCharArray();
        for (char c : charArray) {
            arr[c - 'a']++;
        }

        for (char c : arr) {
            if (c >= 2) {
                return false;
            }
        }
        return true;
    }

    public boolean isUnique2(String astr) {
        HashSet<Character> set = new HashSet<>();
        char[] charArray = astr.toCharArray();
        for (char c : charArray) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}
