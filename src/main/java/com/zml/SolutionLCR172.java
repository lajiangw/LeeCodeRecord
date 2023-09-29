package com.zml;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-09-29 22:04
 */
public class SolutionLCR172 {

    //    暴力解法
    public int countTarget(int[] scores, int target) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                count++;
            }

            if (scores[i] > target) {
                break;
            }
        }
        return count;
    }

    /*
     * 使用二分查找，寻找两个坐标。
     * 寻找第一次等于target的数，记住l
     * 寻找第一次大于target的数，记作r
     * 我们使用r - l + 1 就是 target出现的次数。
     * */
    public int countTarget2(int[] scores, int target) {
        int lef = erFenChaZhao(scores, target, true);
        int rig = erFenChaZhao(scores, target, false);
        if (lef <= rig && rig < scores.length && scores[lef] == target && scores[rig] == target) {
            return rig = lef - 1;
        }
        return 0;
    }

    private int erFenChaZhao(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public int countTarget3(int[] scores, int target) {
        return erFen(scores, target) - erFen(scores, target - 1);
    }

    int erFen(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
