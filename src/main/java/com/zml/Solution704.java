package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-07-31 20:59
 */
public class Solution704 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 4, 5, 6, 77, 88, 99}, 77));

    }

    /**
     * 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return -1;
    }

    public int test(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int num = arr[mid];
            if (t == num) {
                return mid;
            } else if (t > num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
