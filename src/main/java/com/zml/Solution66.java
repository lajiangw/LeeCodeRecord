package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-07-30 20:39
 */
public class Solution66 {
    public static void main(String[] args) {
        plusOne(new int[]{9, 9, 9});
    }


    /**
     * 66 加1
     * 只需要将末尾—+1 ， 个位数字+1 只有两种结果，一种是9 一种是非9 。9加1 需要往
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
