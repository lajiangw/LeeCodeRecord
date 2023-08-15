package com.zml;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-15 21:30
 */
public class Solution387 {
    public static void main(String[] args) {

    }

//    因为只会出现字母，所以创建一个26的数组代表26字母，出现一次就进行+1
//    然后再次遍历s字符串，一次判断只出现一次的字符串，然后进行返回即可。
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;

    }
}
