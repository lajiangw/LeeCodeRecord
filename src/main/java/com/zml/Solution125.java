package com.zml;

/**
 * @author ZhangMinlei
 * @description 125. 验证回文串
 * @date 2023-09-17 9:46
 */
public class Solution125 {
    public static void main(String[] args) {
        boolean palindrome = new Solution125().isPalindrome("A man, a plan, a canal: Panama");
    }

    public boolean isPalindrome(String s) {
        if (s.equals(" ")) return true;
//    移除空格和字母
        String tString = s.replaceAll("[^a-zA-Z0-9]", "");
//        翻转字符串进行判断
        int length = tString.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            stringBuilder.append(tString.charAt(i));
        }
        System.out.println(stringBuilder);
        System.out.println(tString);
        return stringBuilder.toString().equalsIgnoreCase(tString);
    }

    public boolean isPalindrome2(String s) {
        String tString = s.replaceAll("[^a-zA-Z0-9]", "");

        int len = tString.length(), left = 0, right = len - 1;
        while (left < right) {
            if (Character.toLowerCase(tString.charAt(left)) != Character.toLowerCase(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
