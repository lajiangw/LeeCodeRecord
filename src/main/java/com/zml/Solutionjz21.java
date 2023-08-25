package com.zml;

import java.util.Arrays;

/**
 * @author ZhangMinlei
 * @description 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * @date 2023-08-13 19:51
 */
public class Solutionjz21 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(exchange4(new int[]{1, 2, 3, 4})));

    }

    public static int[] exchange(int[] nums) {
        int n = nums.length, index = 0;
//        存放奇数的数组
        int[] res = new int[n];
//        找到奇数
        for (int num : nums) {
            if (num % 2 == 1) {
                res[index++] = num;
            }
        }

//        找到偶数，放到后面
        for (int num : nums) {
            if (num % 2 == 0) {
                res[index++] = num;
            }
        }
        return res;
    }

    /**
     * 两次遍历 第一次查找为偶数 放到arr 第二次查找奇数 放到arr
     *
     */
    public static int[] exchange2(int[] nums) {
        int n = nums.length;
        int k = 0;
        int[] arr = new int[n];
        for (int num : nums) {
            if (num % 2 == 1) {
                arr[k++] = num;
            }
        }

        for (int num : nums) {
            if (num % 2 == 0) {
                arr[k++] = num;
            }
        }

        return arr;
    }

    /**
     * 一次遍历，使用双指针，如果查到的是偶数，就从后面放入元素，如果是 奇数，则从前面放入元素
     */
    public int[] exchange3(int[] nums) {
        int[] arr = new int[nums.length];
        int r = nums.length - 1;
        int l = 0;
        for (int num : nums) {
            if (num % 2 == 0) arr[r--] = num;
            else arr[l++] = num;
        }
        return arr;
    }

    /**
     * 使用一次遍历，当是奇数时，代表排序正确。反之则跳出循环，如果是偶数，则从尾部开始遍历，如果是偶数，则代表排序正确。跳出循环
     * 判断右指针是否大于左指针，如果大于，将刚检查出来不符合规则的元素进行交换即可。
     */
    public static int[] exchange4(int[] nums) {
        int r = nums.length - 1;
        int l = 0;
        while (l < r) {
            while (l < r && nums[l] % 2 == 1) {
                l++;
            }

            while (l < r && nums[r] % 2 == 0) {
                r--;
            }

            if (r > l) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
            }
        }
        return nums;
    }


}
