package com.zml;

import java.util.*;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-21 20:45
 */
public class Solution448 {
    public static void main(String[] args) {
        Solution448 solution448 = new Solution448();
        System.out.println(solution448.findDisappearedNumbers2(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int j : nums) {
            set.add(j);
        }

        for (int i = 0; i < len; i++) {
            if (!set.contains(nums[i])) {
                list.add(i);
            }
        }
        return list;
    }


    public List<Integer> findDisappearedNumbers2(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
//            获得到索引 n-1 的 是将范围从 1 - n 转换为 0 - n -1
            int x = (num - 1) % n;
//            将索引的值进行 +n
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<>();
//        遍历 到n
        for (int i = 0; i < n; i++) {
//            只要不大于n的元素，则代表没有出现过
            if (nums[i] <= n) {
//                i +1 是因为前面吧范围修改了
                ret.add(i + 1);
            }
        }
        return ret;
    }

    public List<Integer> findDisappearedNumbers3(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            int x = (num - 1) % len;
            nums[x] += len;
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (nums[i] <= len) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
