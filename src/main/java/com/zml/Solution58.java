package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-01 21:56
 */
public class Solution58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world "));
    }

    /**
     * 从 末尾开始遍历，只要不等于空，就 +1 小心 最后一个是空格， if elseif 只会选择一个进入。
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {

        int l = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                l++;
            } else if (l != 0)
                return l;
        }
        return l;
    }

//    第二种解法
    public int lengthOfLastWord2(String s) {
//        取出开头和结尾的空格
        s = s.trim();
        int i1 = s.lastIndexOf(" ");
        return s.length() - i1 - 1;
    }
}


