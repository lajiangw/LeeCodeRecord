package com.zml;

/**
 * @author ZhangMinlei
 * @description 70. 爬楼梯
 * @date 2023-08-27 22:51
 */
public class Solution70 {
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 0; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
