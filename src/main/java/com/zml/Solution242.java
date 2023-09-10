package com.zml;

/**
 * @author ZhangMinlei
 * @description 242. 有效的字母异位词
 * @date 2023-09-10 9:22
 */
public class Solution242 {

    /*
     * 使用哈希映射进行计算，s出现的字母++ t出现字母-- ，最后判断数组中是否为0即可。
     * */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    //    优化写法
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            --arr[c - 'a'];
            if (arr[c - 'a'] < 0) return false;
        }
        return true;
    }
}
