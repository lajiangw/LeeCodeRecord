package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-07-29 20:27
 */
public class Solution88 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[]{2, 5, 6};
        merge(arr1, 3, arr2, 3);
    }

    /**
     * 88 河滨数组
     * 最后是需要放到 nums1 数组中去，所以比较两个数组大的值放到num1中去即可。
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        -1 防止数组越界和更好的遍历
        int i = m - 1, j = n - 1, k = m + n - 1;
//        从后往前遍历 比较适合放最大的，原始数组就是已经拍好序的。
        while (j >= 0) {
            if (i < 0 || nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            } else
                nums1[k--] = nums1[i--];
        }
    }
}
