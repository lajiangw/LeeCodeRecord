package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-09-21 14:12
 */
public class Solution509 {
    public int fib(int n) {
//        递归算法
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
