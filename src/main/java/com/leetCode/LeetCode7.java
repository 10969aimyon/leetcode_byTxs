package com.leetCode;



/**
 * 104. 二叉树的最大深度
 */

public class LeetCode7 {


    //  Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

      // 递归
      public int maxDepth(TreeNode root) {
          if(root == null){
              return 0;
          }
          return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
      }

}
