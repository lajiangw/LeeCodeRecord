package com.zml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-05 21:28
 */
public class Solution349 {
    public static void main(String[] args) {
        intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        int[] ints = new int[set.size()];
        int k = 0;
        for (int i : set) {
            ints[k] = i;
            k++;
        }
        return ints;
    }

    /**
     * 将两个数组元素存放到连个set集合中，遍历num2数组时，只需向set2 中添加 set1 包含的元素即可。最后遍历set2 存入数组并返回
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
        int[] arr = new int[set2.size()];
        int k = 0;
        for (int i : set2) {
            arr[k++] = i;
        }
        return arr;
    }
}
