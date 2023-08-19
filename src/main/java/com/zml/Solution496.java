package com.zml;

import java.util.Arrays;

/**
 * @author ZhangMinlei
 * @description 496. 下一个更大元素 I
 * @date 2023-08-19 20:05
 */
public class Solution496 {


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
// 依次遍历num1 中每个元素，进行替换。
        for (int i = 0; i < nums1.length; i++) {
            int index = findIndex(nums2, nums1[i]);
            int top = findTop(nums2, nums1[i], index);
            nums1[i] = top;
        }
        return nums1;
    }

    //    查找传入数组的下标 如果没有则返回-1
    private int findIndex(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }

    //    从传入的下标开始遍历，当遇到比target大的元素，则将当前元素返回，否则返回-1
    private int findTop(int[] arr, int target, int start) {
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > target) return arr[i];
        }
        return -1;
    }
}
