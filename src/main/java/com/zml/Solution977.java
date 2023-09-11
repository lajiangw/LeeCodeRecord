package com.zml;

import java.util.Arrays;

/**
 * @author ZhangMinlei
 * @description 977. 有序数组的平方
 * @date 2023-09-11 15:33
 */
public class Solution977 {
    //    给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquares2(int[] nums) {
        int i = nums.length;
        int left = 0;
        int right = i - 1;
        int[] ints = new int[i];

        while (left <= right) {
            i--;
//            因为数组是排序好的，越来越大 如果 左指针+ 右指针 小于 0 则说明 左边指针平方小
            if (nums[left] + nums[right] < 0) {
//                则根据i 的值，将元素放到新的值。
                ints[i] = nums[left] * nums[left];
                left++;
            } else {
//                否则 则是右边的值比较小  将右边的值放到数组中
                ints[i] = nums[right] * nums[right];
                right--;
            }
        }
        return ints;
    }
}
