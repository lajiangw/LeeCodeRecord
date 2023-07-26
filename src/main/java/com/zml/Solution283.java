package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-07-26 20:09
 */
public class Solution283 {

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0,2,4});
    }

    /**
     * 优化版 直接在一个循环将不等0的数找出，并赋值给j指针，并+1，
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int length;
        if (nums == null || (length = nums.length) == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                if (i > j) {// #1
//                    题目中只有0 和其他数字两个情况，当把i当前的下标给到j 并把i的值置为0；不需要担心最左边不是0 ，因为j汇编力道
                    nums[j] = nums[i];
                    nums[i] = 0;

                }
                j++;
            }
        }
    }

    /**
     * 只需要找到不为0的数，并用s指针记录，最后的肯定是0 然后从s的位置开始遍历，全部赋值0 即可
     * 不需要将数组排序
     *
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[s++] = nums[i];
            }
        }
        for (int i = s; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
