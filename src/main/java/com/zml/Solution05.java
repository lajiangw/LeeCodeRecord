package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-09 21:10
 */
public class Solution05 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy"));
    }

    /**
     * 在java中 ，字符串是不可以被修改的，我们创建一个StringBuilder 为arr
     * 遍历 s 字符串，当s 的某个元素为空格时，我们在 arr 追加%20  如果为其他 则追加他本身
     * 最后将 res返回即可
     * @param s
     * @return
     */
    public static String replaceSpace(String s) {
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') arr.append("%20");
            else arr.append(s.charAt(i));
        }
        return arr.toString();
    }
}
