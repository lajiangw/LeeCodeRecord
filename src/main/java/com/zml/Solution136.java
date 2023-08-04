package com.zml;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-03 23:16
 */
public class Solution136 {

    /**
     * 136. 只出现一次的数字
     * 利用hashset 解决，将 set.add 返回 是否添加成功，如果添加失败，则代表，元素重复，我们将其重复的元素删除即可。
     * isEmpty() 判断集合是否为空， 如果为空则返回 -1 不为空遍历集合，变回下一个元素，也就是第一个
     * iterator（） 利用迭代器遍历元素，里面有三个方法 next代表返回下一个元素 hashNext 此元素是否存在，remove 删除元素
     *
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        return set.isEmpty() ? -1 : set.iterator().next();
    }

    public int test(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int s : nums) {
            if (!set.add(s)) {
                set.remove(s);
            }
        }
        return set.isEmpty() ? -1 : set.iterator().next();
    }
}
