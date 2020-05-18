package com.leetCode;

/**
 * 26. 删除排序数组中的重复项
 */
public class LeetCode4 {

    public int removeDuplicates(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int q = 0;
        int p = 1;
        while (p < nums.length){
            if (nums[q] == nums[p]){
                p++;
            }else {
                nums[q+1] = nums[p];
                q++;
            }
        }
        return q+1;
    }

    public static void main(String[] args) {

    }
}
