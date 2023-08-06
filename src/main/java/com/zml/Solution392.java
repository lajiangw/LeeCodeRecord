package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-06 20:31
 */
public class Solution392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }


    /**
     * 将字符串当做字符数组，顺序遍历t，当 s的某个元素等于 t的某个元素，k 加1  每次判断k是否等于 s是否等于数组的元素
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int k = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(k) == t.charAt(i)) k++;
            if (k == s.length()) return true;
        }
        return false;
    }
}
