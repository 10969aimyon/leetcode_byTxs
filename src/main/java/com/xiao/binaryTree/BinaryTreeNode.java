package com.xiao.binaryTree;

public class BinaryTreeNode {
    // 该节点的元素、左节点和右节点
    int data;
    BinaryTreeNode leftNode = null;
    BinaryTreeNode rightNode  = null;


    public void setBinaryNode(int data){
        this.data = data;
    }
    public void setLeftNode(BinaryTreeNode node){
        this.leftNode = node;
    }
    public void setRightNode(BinaryTreeNode node){
        this.rightNode = node;
    }

}
