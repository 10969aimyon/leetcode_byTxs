package com.xiao.binaryTree;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinaryTree tree = new BinaryTree(nums);
        tree.preOrder(tree.root);
        System.out.println("----------");
        tree.inOrder(tree.root);
        System.out.println("----------");

        tree.postOrder(tree.root);
    }
}
