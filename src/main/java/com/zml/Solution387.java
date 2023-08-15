package com.zml;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-15 21:30
 */
public class Solution387 {

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
