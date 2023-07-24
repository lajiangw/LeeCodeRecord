package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-07-24 21:54
 */
public class Solution2 {
    /**
     * 26 删除有序数组中的重复项
     * 使用双指针的解法，当t2搜到与 t1 指向的相同的元素时，就把t1 下一个元素置换为 t2 指向的元素。
     * 如果t2 指向的元素与t1 想同 则t2 向后移动1位
     * 最后返回是 t1 +1 的数组大小。
     * 如果不记得请 debug
     * 题解: https://leetcode.cn/problems/remove-duplicates-from-sorted-array/solutions/34033/shuang-zhi-zhen-shan-chu-zhong-fu-xiang-dai-you-hu/
     *
     * @param nums
     * @return
     */

    public static int removeDuplicates(int[] nums) {
        int t1 = 0;
        int t2 = 1;
        while (t2 < nums.length) {
            if (nums[t1] != nums[t2]) {
                nums[t1 + 1] = nums[t2];
                t1++;
            }
            t2++;
        }
        return t1 + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4, 5};
        System.out.println(Solution2.removeDuplicates(arr));
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
