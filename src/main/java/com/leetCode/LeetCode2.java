package com.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 两数之和1
 */
public class LeetCode2 {

    // 暴力法 时间复杂度 O(n^2) 空间复杂度O(1)
    public static int[] twoSum(int[] nums, int target) throws Exception {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new Exception("找不到");
    }

    // Hash法 时间复杂度O(n) 空间复杂度 O(n)
    public static int[] twoSum2(int nums[], int target) throws Exception {
        // 将数组下标和实际数转为map
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i){
                return new int[]{i, map.get(temp)};
            }
        }
        throw new Exception("没找到");
    }

    // 一遍Hash法 时间复杂度O(n) 空间复杂度 O(n)
    // 先找有没有，没有再存
    public static int[] twoSum3(int[] nums, int target) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i){
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new Exception("没找到");
    }

        public static void main(String[] args) {
            try {
                System.out.println(Arrays.toString(twoSum3(new int[]{1, 2, 3, 4, 5, 6}, 7)));
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}
