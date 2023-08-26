package com.zml;

import java.util.Arrays;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-07-27 8:50
 */
public class Test {
    //    写一个冒泡排序
    public static void bubbleSort(int[] a) {
        int temp = 0;
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

//   二分查找
    public static int binarySearch(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4, 65, 2, -31, 0, 99, 2, 83, 782, 1};
        System.out.println("before sort:" + Arrays.toString(a));
        bubbleSort(a);
        System.out.println("after sort:" + Arrays.toString(a));
        int index = binarySearch(a, 1);
        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index:" + index);
        }
    }



}
