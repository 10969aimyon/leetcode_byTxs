package com.leetCode;

import java.util.HashSet;

/**
 * 分糖果
 */
public class LeetCode1 {
    public static int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int candy : candies) {
            set.add(candy);
        }
        return Math.min(set.size(), candies.length / 2);
    }




    public static void main(String[] args) {
        int i = distributeCandies(new int[]{2, 2, 2, 4, 4, 4});
        System.out.println(i);
        System.out.println("okk");
    }
}
