package com.zml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-02 21:04
 */
public class Solution03 {
    public static void main(String[] args) {
        findRepeatNumber2(new int[]{3, 1, 2, 3});
    }

    /**
     * 剑指 Offer 03. 数组中重复的数字
     * 利用set的不可重复性。遍历数组进行判断，如果set中不存在，将该元素存入集合中，如果该元素存在，说明该元素重复，返回该元素即可
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else
                return nums[i];
        }
        return -1;
    }

    /**
     * 首相将数组排序，然后两个两个元素判断，只要相等，就直接返回该数。
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber2(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                res = nums[i];
                break;
            }
        }
        return res;
    }
}
