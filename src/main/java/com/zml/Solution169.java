package com.zml;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-04 21:04
 */
public class Solution169 {

    public static void main(String[] args) {
        System.out.println(majorityElement3(new int[]{2, 2, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}));
    }

    //    给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 将数组存放到 map中，键代表 元素，值代表出现的次数， 最后遍历集合，将 大于 大于 ⌊ n/2 ⌋取出即可
     *
     * @param nums
     * @return
     */

    public int majorityElement2(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long limit = nums.length >> 1;
        for (Map.Entry<Integer, Long> entry : map.entrySet())
            if (entry.getValue() > limit)
                return entry.getKey();
        return -1;
    }

    /**
     * 将 数组中元素作为键，出现的次数作为值，出现一次 将值+1，最后遍历集合，将大于 length / 2 的key返回即可
     *
     * @param nums
     * @return
     */
    public static int majorityElement3(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int limit = nums.length >> 1;
        for (int n : nums) {
            if (!hashMap.containsKey(n)) {
                hashMap.put(n, 1);
            } else {
                hashMap.put(n, hashMap.get(n) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> m : hashMap.entrySet()) {
            if (m.getValue() > limit) {
                return m.getKey();
            }
        }
        return -1;
    }
}
