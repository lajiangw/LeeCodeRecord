package com.zml;

import java.util.Arrays;

/**
 * @author ZhangMinlei
 * @description 557. 反转字符串中的单词 III 自己做出来了
 * @date 2023-08-14 20:58
 */
public class Solution557 {
    public static void main(String[] args) {
        Solution557 solution557 = new Solution557();
        System.out.println(solution557.reverseWords2("Let's take LeetCode contest"));
    }

    /**
     * 暴力枚举 当遇到为空格，则进行交换 因为最后一次交换没有空格，
     * 因为k指向的是 最后一个空格后一个元素，直接将最后一串进行交换即可
     */
    public String reverseWords(String s) {
        int k = 0;
        char[] charArray = s.toCharArray();
        int length = charArray.length - 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                int a = i - 1;
                while (k <= a) {
                    char temp = charArray[a];
                    charArray[a] = charArray[k];
                    charArray[k] = temp;
                    a--;
                    k++;
                }
                k = i + 1;
            }

            if (i == charArray.length - 1) {
                while (k <= length) {
                    char temp = charArray[length];
                    charArray[length] = charArray[k];
                    charArray[k] = temp;
                    k++;
                    length--;
                }
            }
        }
        return String.valueOf(charArray);
    }


    public String reverseWords2(String s) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int start = 0;

        for (int i = 0; i < length; i++) {
            if (charArray[i] == ' ' || i == length - 1) {
                int end = (i == length - 1) ? i : i - 1;
                reverse(charArray, start, end);
                start = i + 1;
            }
        }
        return String.valueOf(charArray);
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
