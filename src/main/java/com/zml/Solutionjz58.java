package com.zml;

/**
 * @author ZhangMinlei
 * @description 剑指 Offer 58 - II. 左旋转字符串
 * @date 2023-09-13 19:22
 */
public class Solutionjz58 {

    public String reverseLeftWords(String s, int n) {
        char[] charArray = s.toCharArray();
        String res = "";
        for (int i = n; i < charArray.length; i++) {
            res += s.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public String reverseLeftWords2(String s, int n) {
        String res = "";
        for (int i = n; i < n + s.length(); i++) {
            res += s.charAt(i % s.length());
        }
        return res;
    }

    public String reverseLeftWords3(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

}
