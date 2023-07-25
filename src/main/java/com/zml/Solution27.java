package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-07-25 21:17
 */
public class Solution27 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        int[] arr = new int[]{3, 2, 2, 3};
        System.out.println(solution27.removeElement2(arr, 3));
    }

    /**
     * 27. 移除元素
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while (right <= nums.length - 1) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;

            }
            right++;
        }
        return left;
    }

    /**
     * 我们的目的是把等于val的值移动到数组的最右侧。所以index要从0开始。只要有不相等就将值给到index 并且+1即可
     * 遍历整个数组，当n不等于val的时候，就把当前n的值复制给index，并且index+1，如果n相等val，说明不是我们要找的元素，直接跳过。
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int n : nums) {
            if (n != val) {
                nums[index++] = n;
            }
        }
        return index;
    }

    public int removeElement3(int[] nums, int val) {
        int x = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val) {
                nums[x++] = nums[i];
            }
        }
        return x;
    }


}
