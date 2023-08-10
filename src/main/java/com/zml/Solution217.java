package com.zml;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-10 20:38
 */
public class Solution217 {
    public static void main(String[] args) {

    }

    /**
     *  利用hashset的不可重复性，进行遍历数组，即可。
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
