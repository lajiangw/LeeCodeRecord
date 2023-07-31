package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-07-31 20:59
 */
public class Solution704 {
    /**
     * 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left >= right) {
            int mid = (right + left) / 2 + left;
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
}
