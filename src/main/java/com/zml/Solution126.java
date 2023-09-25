package com.zml;

/**
 * @author ZhangMinlei
 * @description LCR 126. 斐波那契数
 * @date 2023-09-25 21:23
 */
public class Solution126 {
//    动态规划
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
