package com.leetCode;

/**
 * 53. 最大子序和
 */
public class LeetCode5 {

    /**
     * 动态规划 ? 贪心？
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0){
                sum += nums[i];
            }else {
                sum = nums[i];
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }





    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1,1,-2,2,-3,3,-4}));
    }
}
