package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-12 21:08
 */
public class Solution28 {
    public static void main(String[] args) {
        String hay = "sadbutsdad";
        String sad = "dad";
        System.out.println(strStr(hay, sad));
    }


    /**
     * 遍历haystack字符串，在他的里面寻找needle匹配的项。因为b每次循环清零。在较长字符串中和短字符串比较。
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int h = haystack.length(), n = needle.length();
        char[] hh = haystack.toCharArray(), nn = needle.toCharArray();
//        h -n 是因为 当我们i 大于 h-n的长度时，剩余的数组长度已经不能容纳我们的needle字符了，所以没有了遍历的必要
        for (int i = 0; i <= h - n; i++) {
//            将 i赋值给a, 是从i的下标开始遍历。
            int a = i, b = 0;
//            b小于n是因为 needle的字符长度只有n，如果b大于了n数组则就下标越界了
            while (b < n && hh[a] == nn[b]) {
                a++;
                b++;
            }
//            因为每次b的值都会清零，当遇到想等则就+1，可以用b来判断是否匹配齐全了相等则代表匹配陈工
            if (b == n) return i;
        }
        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        char[] hh = haystack.toCharArray();
        char[] nn = needle.toCharArray();

        for (int i = 0; i <= h - n; i++) {
            int a = i;
            int b = 0;
            while (b < n && hh[a] == nn[b]) {
                a++;
                b++;
            }

            if (b == n) return i;
        }
        return -1;
    }
}
