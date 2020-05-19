package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 53. 合并两个有序数组
 */

public class LeetCode6 {

    // 我能想到的暴力法
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 先将nums2合并到nums1
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        // 冒泡排序
        for (int j = 0; j < nums1.length - 1; j++) {
            for (int k = 0; k < nums1.length - 1 - j; k++){
                if (nums1[k+1] < nums1[k]){
                    int temp = nums1[k+1];
                    nums1[k+1] = nums1[k];
                    nums1[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
    // 改进的双指针法（因为它们两个都是有序数组）
    public static void merge2(int[] nums1, int m, int[] nums2, int n){
        ArrayList<Integer> numsTemp = new ArrayList<>();
        int i = 0;  // nums1的指针
        int j = 0;  // nums2的指针
        while (true){
            if (i == m){
                for (;j < n;j++){
                    numsTemp.add(nums2[j]);
                }
                break;
            }
            if (j == n){
                for (;i < m;i++){
                    numsTemp.add(nums1[i]);
                }
                break;
            }
            if (nums1[i] >= nums2[j]){
                numsTemp.add(nums2[j]);
                j++;
                continue;
            }
            if (nums1[i] <= nums2[j]){
                numsTemp.add(nums1[i]);
                i++;
            }
        }
        for (int p = 0; p < m + n;p++){
            nums1[p] = numsTemp.get(p);
        }

    }
    public static void main(String[] args) {
        merge2(new int[]{2,0}, 1, new int[]{1}, 1);
    }
}
