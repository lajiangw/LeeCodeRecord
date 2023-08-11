package com.zml;

import java.util.*;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-11 19:16
 */
public class Solution350 {

    public static void main(String[] args) {
        Solution350 solution350 = new Solution350();
        System.out.println(Arrays.toString(solution350.intersect3(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    /**
     * 将任意一个数组转换为list集合，遍历另一个数组，只要list包含这个元素 添加进集合，并且在list集合中删除，防止重复判断
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i : nums1) {
            list1.add(i);
        }
        for (int j : nums2) {
            if (list1.contains(j)) {
                arrayList.add(j);
                list1.remove(Integer.valueOf(j));
            }
        }
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }

    /**
     * 使用hashmap 的key作为 数字， value 作为 出现的次数。
     * 遍历数组2 出现一次就在将map中对应的-1  并将这个数组添加到集合即可。
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect2(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>(nums1.length);
        for (int i : nums1) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } else map.put(i, map.get(i) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int s : nums2) {
            Integer count = map.get(s);
            if (count != null && count != 0) {
                list.add(s);
                map.put(s, --count);
            }
        }
        int k = 0;
        int[] arr = new int[list.size()];
        for (int o : list) {
            arr[k++] = o;
        }
        return arr;
    }

    /**
     * 题目规定数组长度 0 - 1000 所以创建一个1001 的数字当做 计数器
     * 遍历mun1数组，将出现的元素作为下标 并 +1 ，
     * 遍历num2 数组，判断元素在num1对应的下标是否 大于0 也就是是否在num1 中也出现过
     * 出现过则 将该元素添加进list集合，并减1
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect3(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];

        for (int n : nums1) {
            arr[n]++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (arr[i] > 0) {
                list.add(i);
                arr[i]--;
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }


}
