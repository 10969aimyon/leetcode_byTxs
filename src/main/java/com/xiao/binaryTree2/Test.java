package com.xiao.binaryTree2;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new Node(1));
        binaryTree.addPre(binaryTree.root, 2);
        binaryTree.addPre(binaryTree.root, 3);
        binaryTree.addPre(binaryTree.root, 4);
        binaryTree.addPre(binaryTree.root, 5);
        binaryTree.addPre(binaryTree.root, 6);
        binaryTree.addPre(binaryTree.root, 7);

        binaryTree.preOrder(binaryTree.root);
    }
}
