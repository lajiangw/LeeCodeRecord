package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-07 19:50
 */
public class Solution383 {
    public static void main(String[] args) {
        canConstruct("aa", "ab");
    }

    //    给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。

    /**
     * 这里使用字频统计的常用方法来解决
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
//        如果 ransomNote 的长度大于 magazine 则无法构成包含关系。
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
//      因为所有的字母都是小数，我们创建26个大小来存放字母。
        int[] arr = new int[26];
        for (char c : magazine.toCharArray()) {
//            这里减去a 在ASCII码中a-z 是连续的，当我们用 某一个字母减去a的值，也就是他在数组的的位置，我们将其+1 出现一次就+1
            arr[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
//            这里我们使用同样的方法，找到字母对应的下标，将其减1 ，
            arr[c - 'a']--;
//            一次判断这个对应下标的字母出现次数是否小于0 ，
//            如果小于0则说明这个元素在ransomNote出现次数大于magazine， 则无法构成包含关系
            if (arr[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
