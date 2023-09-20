package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-09-19 15:24
 */
public class Solution69 {
    int s;

    public int mySqrt(int x) {
        s = x;
        if (x == 0) return 0;
        return ((int) (squrts(x)));
    }

    public double squrts(double x) {
        double res = (x + s / x) / 2;
        if (res == x) {
            return x;
        } else {
            return squrts(res);
        }
    }

    public int mySqrt2(int a) {
//        使用牛顿迭代法
        long x = a;
//        while 的作用是迭代至 x 非常接近答案 √a，这个非常接近在这里其实就是在计算机精度下 x 等于 √a。
        while (x * x > a) x = (x + a / x) / 2;
        return (int) x;
    }
}
